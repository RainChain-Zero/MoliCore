package com.rainchain.jasmine.mapper.amusement;

import com.rainchain.jasmine.entity.OmegaPixivArtwork;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2023-04-09 22:28
 */
@Mapper
public interface MoeMapper {

    List<OmegaPixivArtwork> randomMoe(Integer num, List<String> tags);
}
