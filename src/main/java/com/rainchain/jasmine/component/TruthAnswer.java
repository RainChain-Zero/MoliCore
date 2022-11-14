package com.rainchain.jasmine.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-14 21:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TruthAnswer {
    @NotBlank(message = "qq不能为空")
    private String qq;
    @NotNull(message = "id不能为空")
    private Integer id;
    @NotBlank(message = "answer不能为空")
    private String answer;
}
