-- begin INSTRUMENT2_INSTRUMENT_TWO_DATA
alter table INSTRUMENT2_INSTRUMENT_TWO_DATA add constraint FK_INSTRUMENT2_INSTRUMENT_TWO_DATA_ON_PROPOSAL foreign key (PROPOSAL_ID) references PROPOSALS_PROPOSAL(ID)^
create index IDX_INSTRUMENT2_INSTRUMENT_TWO_DATA_ON_PROPOSAL on INSTRUMENT2_INSTRUMENT_TWO_DATA (PROPOSAL_ID)^
-- end INSTRUMENT2_INSTRUMENT_TWO_DATA
-- begin INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK
alter table INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK add constraint FK_INSTWODATUSE_ON_INSTRUMENT_TWO_DATA foreign key (INSTRUMENT_TWO_DATA_ID) references INSTRUMENT2_INSTRUMENT_TWO_DATA(ID)^
alter table INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK add constraint FK_INSTWODATUSE_ON_USER foreign key (USER_ID) references SEC_USER(ID)^
-- end INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK
