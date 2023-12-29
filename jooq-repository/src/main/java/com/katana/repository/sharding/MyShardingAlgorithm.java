package com.katana.repository.sharding;

import lombok.Getter;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.util.Collection;
import java.util.Properties;

/**
 * Standard sharding algorithm.
 *
 * @param <T> class type of sharding value
 */
public class MyShardingAlgorithm implements StandardShardingAlgorithm<String> {

    @Getter
    private Properties props;

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
        return null;
    }

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<String> shardingValue) {
        return null;
    }


    @Override
    public void init(Properties properties) {
        this.props = properties;
    }
}
