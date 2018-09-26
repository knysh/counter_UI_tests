package framework.cucumber.transform.impl;

import aqa.utils.regex.RegexMatcher;
import aqa.utils.xml.XmlReader;
import framework.cucumber.Constants;
import framework.cucumber.transform.ITransformer;
import framework.dataproviders.Configuration;

public class TestDataTransformer implements ITransformer {

    private static final String XPATH_REGEX = "\\.([\\S]+?)\\.([\\S]+)";
    private static final String FILENAME_REGEX = "\\.([\\S]+?)\\.([\\S]+)";

    @Override
    public String transformData(String token) {
        String fileName = RegexMatcher.regexGetMatchGroup(token, getToken() + FILENAME_REGEX, 1);
        String xpath = Constants.XPATH_START_POINT.toString() + RegexMatcher
                .regexGetMatchGroup(token, getToken() + XPATH_REGEX, 2).replace(".", "//");
        String pathToXml = Configuration.getCurrentEnvironment().getDataPath() + fileName + ".xml";
        return XmlReader.getNodeText(pathToXml, xpath);
    }

    @Override
    public String getToken() {
        return "@testData";
    }
}
