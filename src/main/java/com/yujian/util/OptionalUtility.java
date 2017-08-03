package com.yujian.util;

import java.util.Optional;
import java.util.Properties;

/**
 * @author yujianjian  2017-08-04 上午7:32
 */
public class OptionalUtility {

    public static Optional<Integer> stringToInt(String s){
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

    }

    public int readDuration(Properties props,String name){
        return Optional.ofNullable(props.getProperty(name))
            .flatMap(OptionalUtility::stringToInt)
            .filter(i -> i>0)
            .orElse(0);
    }
}
