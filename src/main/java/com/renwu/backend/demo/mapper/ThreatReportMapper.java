package com.renwu.backend.demo.mapper;

import com.renwu.backend.demo.model.ThreatReport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ThreatReportMapper {
    int deleteByPrimaryKey(String reportid);

    int insert(ThreatReport record);

    int insertSelective(ThreatReport record);

    List<ThreatReport> selectByPrimaryKey(String reportid);

    int updateByPrimaryKeySelective(ThreatReport record);

    int updateByPrimaryKey(ThreatReport record);
}