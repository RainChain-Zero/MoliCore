package com.rainchain.jasmine.service;

import com.rainchain.jasmine.entity.OmegaPixivArtwork;
import com.rainchain.jasmine.mapper.amusement.MoeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2023-04-09 22:36
 */
@Service
public class MoeService {
    @Resource
    private MoeMapper moeMapper;
    
    public List<OmegaPixivArtwork> randomMoe(Integer num, List<String> tags) {
        return moeMapper.randomMoe(num, tags);
    }
}
