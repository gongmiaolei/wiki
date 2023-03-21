package com.jiawa.wiki.mapper;

import com.jiawa.wiki.resp.StatisticResp;

import java.util.List;

public interface EbookSnapshotMapperCust {

    public void genSnapshot();
    public void genSnapshot1();
    public void genSnapshot2();

    List<StatisticResp> getStatistic();

    List<StatisticResp> get30Statistic();
}
