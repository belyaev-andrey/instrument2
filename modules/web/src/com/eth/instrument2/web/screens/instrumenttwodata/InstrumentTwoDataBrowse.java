package com.eth.instrument2.web.screens.instrumenttwodata;

import com.haulmont.cuba.gui.screen.*;
import com.eth.instrument2.entity.InstrumentTwoData;

@UiController("instrument2_InstrumentTwoData.browse")
@UiDescriptor("instrument-two-data-browse.xml")
@LookupComponent("instrumentTwoDatasTable")
@LoadDataBeforeShow
public class InstrumentTwoDataBrowse extends StandardLookup<InstrumentTwoData> {
}