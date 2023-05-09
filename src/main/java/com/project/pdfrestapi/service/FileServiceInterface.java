package com.project.pdfrestapi.service;

import com.lowagie.text.DocumentException;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public interface FileServiceInterface {

    ByteArrayInputStream convertDocToPdf(MultipartFile file) throws DocumentException, IOException;
}
