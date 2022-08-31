package com.rainchain.jasmine.mapper;

import com.rainchain.jasmine.entity.Favorconf;
import com.rainchain.jasmine.entity.Itemconf;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022/08/30 23:21
 */

@Mapper
@Repository
public interface RankMapper {
    List<Favorconf> getFavorRankNow();

    List<Itemconf> getFlRankNow();
}
