// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers;

import java.beans.PropertyChangeEvent;

import org.eclipse.jface.fieldassist.DecoratedField;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.TextControlCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.creator.SelectAllTextControlCreator;
import org.talend.designer.core.ui.editor.properties.controllers.generator.IDynamicProperty;

/**
 * DOC yzhang class global comment. Detailled comment <br/>
 * 
 * $Id: TextController.java 1 2006-12-12 下午01:53:53 +0000 (下午01:53:53) yzhang $
 * 
 */
public class TextController extends AbstractElementPropertySectionController {

    private static boolean estimateInitialized = false;

    private static int rowSize = 0;

    /**
     * DOC yzhang TextController constructor comment.
     * 
     * @param dtp
     */
    public TextController(IDynamicProperty dp) {
        super(dp);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.core.ui.editor.properties2.editors.AbstractElementPropertySectionController#createControl()
     */
    @Override
    public Control createControl(final Composite subComposite, final IElementParameter param, final int numInRow,
            final int nbInRow, final int top, final Control lastControl) {
        this.curParameter = param;
        this.paramFieldType = param.getField();
        FormData data;
        Text labelText;

        final DecoratedField dField = new DecoratedField(subComposite, SWT.BORDER, new SelectAllTextControlCreator());
        if (param.isRequired()) {
            FieldDecoration decoration = FieldDecorationRegistry.getDefault().getFieldDecoration(
                    FieldDecorationRegistry.DEC_REQUIRED);
            dField.addFieldDecoration(decoration, SWT.RIGHT | SWT.TOP, false);
        }
        if (param.isRepositoryValueUsed()) {
            FieldDecoration decoration = FieldDecorationRegistry.getDefault().getFieldDecoration(
                    FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
            decoration.setDescription(Messages.getString("TextController.decoration.description")); //$NON-NLS-1$
            dField.addFieldDecoration(decoration, SWT.RIGHT | SWT.BOTTOM, false);
        }
        Control cLayout = dField.getLayoutControl();
        labelText = (Text) dField.getControl();

        labelText.setData(PARAMETER_NAME, param.getName());
        labelText.setEnabled(!param.isReadOnly());

        editionControlHelper.register(param.getName(), labelText, true);

        cLayout.setBackground(subComposite.getBackground());
        labelText.setEditable(!param.isRepositoryValueUsed());
        if (elem instanceof Node) {
            labelText.setToolTipText(VARIABLE_TOOLTIP + param.getVariableName());
        }

        if (param.isRepositoryValueUsed()) {
            addRepositoryPropertyListener(labelText);
        }

        addDragAndDropTarget(labelText);

        CLabel labelLabel = getWidgetFactory().createCLabel(subComposite, param.getDisplayName());
        data = new FormData();
        if (lastControl != null) {
            data.left = new FormAttachment(lastControl, 0);
        } else {
            data.left = new FormAttachment((((numInRow - 1) * MAX_PERCENT) / nbInRow), 0);
        }
        data.top = new FormAttachment(0, top);
        labelLabel.setLayoutData(data);
        if (numInRow != 1) {
            labelLabel.setAlignment(SWT.RIGHT);
        }
        // *********************
        data = new FormData();
        int currentLabelWidth = STANDARD_LABEL_WIDTH;
        Point labelSize = new GC(labelLabel).stringExtent(param.getDisplayName());

        if ((labelSize.x + ITabbedPropertyConstants.HSPACE) > currentLabelWidth) {
            currentLabelWidth = labelSize.x + ITabbedPropertyConstants.HSPACE;
        }

        if (numInRow == 1) {
            if (lastControl != null) {
                data.left = new FormAttachment(lastControl, currentLabelWidth);
            } else {
                data.left = new FormAttachment(0, currentLabelWidth);
            }

        } else {
            data.left = new FormAttachment(labelLabel, 0, SWT.RIGHT);
        }
        data.right = new FormAttachment((numInRow * MAX_PERCENT) / nbInRow, 0);
        data.top = new FormAttachment(0, top);
        cLayout.setLayoutData(data);
        // **********************

        hashCurControls.put(param.getName(), labelText);

        Point initialSize = dField.getLayoutControl().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        // curRowSize = initialSize.y + ITabbedPropertyConstants.VSPACE;
        dynamicProperty.setCurRowSize(initialSize.y + ITabbedPropertyConstants.VSPACE);
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.core.ui.editor.properties.controllers.AbstractElementPropertySectionController#estimateRowSize(org.eclipse.swt.widgets.Composite,
     * org.talend.core.model.process.IElementParameter)
     */
    @Override
    public int estimateRowSize(Composite subComposite, IElementParameter param) {
        if (!estimateInitialized) {
            final DecoratedField dField = new DecoratedField(subComposite, SWT.BORDER, new TextControlCreator());
            Point initialSize = dField.getLayoutControl().computeSize(SWT.DEFAULT, SWT.DEFAULT);
            dField.getLayoutControl().dispose();
            rowSize = initialSize.y + ITabbedPropertyConstants.VSPACE;
            estimateInitialized = true;
        }
        return rowSize;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
     */
    public void propertyChange(PropertyChangeEvent evt) {
        // TODO Auto-generated method stub

    }

    @Override
    public void refresh(IElementParameter param, boolean checkErrorsWhenViewRefreshed) {
        String paramName = param.getName();
        Text labelText = (Text) hashCurControls.get(paramName);
        if (labelText == null || labelText.isDisposed()) {
            return;
        }

        Object value = param.getValue();
        boolean valueChanged = false;
        if (value == null) {
            labelText.setText(""); //$NON-NLS-1$
        } else {
            if (!value.equals(labelText.getText())) {
                labelText.setText((String) value);
                valueChanged = true;
            }
        }

        // Only for job settings View.
        // job settings extra (feature 2710)
        if (param.getCategory() == EComponentCategory.STATSANDLOGS || param.getCategory() == EComponentCategory.EXTRA) {
            Color red = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
            // Color white = Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);

            if ((value instanceof String) && param.isRequired()) {

                String str = (String) value;

                String removedQuotesStr = TalendTextUtils.removeQuotes(str);

                if (str == null || removedQuotesStr.length() == 0 || str.length() == 0) {
                    setTextErrorInfo(labelText, red);
                } else {
                    // labelText.setBackground(white);
                    labelText.setToolTipText("");
                }
            }
        }

        if (checkErrorsWhenViewRefreshed || valueChanged) {
            checkErrorsForPropertiesOnly(labelText);
        }
        fixedCursorPosition(param, labelText, value, valueChanged);

    }

    /**
     * DOC Administrator Comment method "setTextErrorInfo".
     * 
     * @param labelText
     * @param red
     */
    private void setTextErrorInfo(Text labelText, Color red) {
        labelText.setBackground(red);
        labelText.setToolTipText("Value is invalid.");
    }
}
