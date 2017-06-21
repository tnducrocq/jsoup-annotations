package com.fcannizzaro.jsoup.annotations;

import com.fcannizzaro.jsoup.annotations.interfaces.IParsable;

import org.jsoup.nodes.Element;

import java.util.List;

/**
 * Created by Francesco Cannizzaro (fcannizzaro)
 */

public class JP {


    public static <T extends IParsable> T from(Element container, Class<T> clazz) {
        return JsoupProcessor.from(container, clazz);
    }

    public static <T extends IParsable> List<T> fromList(Element container, Class<T> clazz) {
        return JsoupProcessor.fromList(container, clazz);
    }

}
