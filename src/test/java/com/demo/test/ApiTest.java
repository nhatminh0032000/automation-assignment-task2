package com.demo.test;

import com.demo.automation.DataModel.DemoDataModel;
import com.demo.automation.Keywords.ApiKeywords;
import com.demo.automation.Keywords.IApiKeywords;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class ApiTest  {

    @Test
    public void Verify_API_GET_Posts() throws InterruptedException, IOException {

    }
}
