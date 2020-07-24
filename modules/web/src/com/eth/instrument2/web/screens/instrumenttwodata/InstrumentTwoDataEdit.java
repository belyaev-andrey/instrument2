package com.eth.instrument2.web.screens.instrumenttwodata;

import com.haulmont.cuba.gui.screen.*;
import com.eth.instrument2.entity.InstrumentTwoData;

@UiController("instrument2_InstrumentTwoData.edit")
@UiDescriptor("instrument-two-data-edit.xml")
@EditedEntityContainer("instrumentTwoDataDc")
@LoadDataBeforeShow
public class InstrumentTwoDataEdit extends StandardEditor<InstrumentTwoData> {
}