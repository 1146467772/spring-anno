package com.ayuantalking.cap2.config;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class Cap2Filter implements TypeFilter {

    /**
     *
     * @param metadataReader 表示读取到的当前正在扫描的类的信息
     * @param metadataReaderFactory 表示可以获得到其他任何类的信息
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 扫描类的配置信息 描述信息等
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        String className = metadataReader.getClassMetadata().getClassName();
        System.out.println(className);
        if (className.contains("Controller")){
            System.out.println("--"+className);
            return true;
        }
        return false;
    }
}
