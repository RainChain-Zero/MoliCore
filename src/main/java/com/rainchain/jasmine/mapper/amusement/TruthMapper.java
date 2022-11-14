package com.rainchain.jasmine.mapper.amusement;

import com.rainchain.jasmine.entity.Truth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-14 19:30
 */
@Mapper
public interface TruthMapper {
    List<Truth> getTruth();

    String getAnsweredTruth(String qq);

    void addTruth(Truth truth);
}
