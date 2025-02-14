import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Check Value Penyaluran\\20250212_150529\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://stag-patra-logistik.azuralabs.id/login')

not_run: WebUI.setText(findTestObject('Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_113d72 (4)'), 
    'patlog_manajemen')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_648cb7 (4)'), 
    'Tl/nWPU0V52MQE+2jGH8/HDzEI2YIzZ4')

not_run: WebUI.click(findTestObject('Object Repository/Page_POC Patra Logistik/button_Masuk (4)'))

not_run: WebUI.mouseOver(findTestObject('Object Repository/Page_Patra Logistik/div_Patra Logistik (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/span_Penyaluran'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/input_PERTASHOP_filterInput'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/input_TNI Jabar Banten_client'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/input_VHS_dateSelect'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Patra Logistik/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/span_Sat_arrowDown'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/span_19'))

List<List> expectedValues = [['8.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter'
        , '8.000 Liter', '2.000 Liter', '8.000 Liter'], ['2.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter'
        , '8.000 Liter', '3.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter'], ['6.000 Liter', '4.000 Liter', '6.000 Liter'
        , '8.000 Liter', '4.000 Liter', '2.000 Liter', '8.000 Liter', '8.000 Liter', '367 Liter', '7.633 Liter'], ['5.367 Liter'
        , '2.633 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter', '5.000 Liter', '5.000 Liter', '2.000 Liter'
        , '8.000 Liter'], ['8.000 Liter', '8.000 Liter', '8.000 Liter', '8.000 Liter']]

// Function to verify a single page
// Iterate through pages and verify rows
for (List<String> pageExpectedValues : expectedValues) {
    verifyPageValues(pageExpectedValues)

    if (WebUI.verifyElementClickable(findTestObject('Penyaluran Page Values/next page button'), FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('Penyaluran Page Values/next page button'))
    } else {
        break
    }
}

def verifyPageValues(List<String> expectedValues) {
    for (int i = 0; i < expectedValues.size(); i++) {
        def rowObject = findTestObject("Penyaluran Page Values/row $(i + 1)")

        WebUI.verifyElementPresent(rowObject, 2)

        def actualValue = WebUI.getText(rowObject)

        WebUI.verifyEqual(actualValue, expectedValues[i], FailureHandling.CONTINUE_ON_FAILURE)
    }
}

''', 'Test Cases/Check Value Penyaluran', new TestCaseBinding('Test Cases/Check Value Penyaluran',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
