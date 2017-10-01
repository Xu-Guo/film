package com.xu.Controller.admin;

import com.xu.Util.DateUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/admin/film")
public class FilmAdminController {

    @Value("${imageFilePath}")
    private String imageFilePath;

    @RequestMapping("/ckeditorUpload")
    public String ckeditorUpload (@RequestParam("upload") MultipartFile file, String CKEditorFuncNum) throws Exception {

        //get file name
        String fileName = file.getOriginalFilename();

        //get file extension name such as .jpeg, .img
        String suffixName = fileName.substring(fileName.lastIndexOf("."));

        String newFileName = DateUtil.getCurrentDateStr() + suffixName;

        FileUtils.copyInputStreamToFile(file.getInputStream(), new File(imageFilePath + newFileName));

        StringBuffer sb=new StringBuffer();
        sb.append("<script type=\"text/javascript\">");
        sb.append("window.parent.CKEDITOR.tools.callFunction("+ CKEditorFuncNum + ",'" +"/static/filmImage/"+ newFileName + "','')");
        sb.append("</script>");

        return sb.toString();
    }
}
