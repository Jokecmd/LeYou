package com.leyou.upload.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class UploadService {
    private static final List<String> AllowTypes = Arrays.asList("image/jpeg");
    public String uploadImage(MultipartFile file) throws IOException {
        //校验文件类型
        String contentType = file.getContentType();
        if (!AllowTypes.contains(contentType)){
            throw new LyException(ExceptionEnum.BRANDSAVE_ERROR);
        }
        //文件内容
        BufferedImage image = ImageIO.read(file.getInputStream());
        if (image==null){
            throw new LyException(ExceptionEnum.BRANDSAVE_ERROR);
        }
        //准备目标路径
        File dest = new File("D:\\java\\java手册\\乐友商城",file.getOriginalFilename());
        //保存文件到本地
        file.transferTo(dest);
        //返回路径
        return "http://image.leyou.com/" + file.getOriginalFilename();
    }
}
