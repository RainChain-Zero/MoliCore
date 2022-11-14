package com.rainchain.jasmine.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-14 21:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TruthHistoryObj {
    private String answer;
    private Long timeStamp;
}
