-- begin INSTRUMENT2_INSTRUMENT_TWO_DATA
create table INSTRUMENT2_INSTRUMENT_TWO_DATA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PROPOSAL_ID varchar(36),
    PURPOSE varchar(255) not null,
    --
    primary key (ID)
)^
-- end INSTRUMENT2_INSTRUMENT_TWO_DATA
-- begin INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK
create table INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK (
    INSTRUMENT_TWO_DATA_ID varchar(36) not null,
    USER_ID varchar(36) not null,
    primary key (INSTRUMENT_TWO_DATA_ID, USER_ID)
)^
-- end INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK
