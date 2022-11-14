package com.rainchain.jasmine.mybatis;


import com.alibaba.fastjson.TypeReference;
import com.rainchain.jasmine.component.TruthHistoryObj;

import java.util.List;

public class TruthHistoryListTypeHandler extends ListTypeHandler<TruthHistoryObj> {
    @Override
    protected TypeReference<List<TruthHistoryObj>> specificType() {
        return new TypeReference<List<TruthHistoryObj>>() {
        };
    }
}
