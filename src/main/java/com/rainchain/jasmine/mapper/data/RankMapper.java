package com.rainchain.jasmine.mapper.data;

import com.rainchain.jasmine.entity.Favorconf;
import com.rainchain.jasmine.entity.Itemconf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022/08/30 23:21
 */

@Mapper
public interface RankMapper {
    List<Favorconf> getFavorRankNow();

    List<Itemconf> getFlRankNow();
}
