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


RunConfiguration.setExecutionSettingFile('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\Katalon\\20250129_104121\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',['row1': '']), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://stag-patra-logistik.azuralabs.id/login\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_113d72 (2)\'), \n    \'patlog_manajemen\')\n\nWebUI.setEncryptedText(findTestObject(\'Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_648cb7 (2)\'), \n    \'Tl/nWPU0V52MQE+2jGH8/HDzEI2YIzZ4\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_POC Patra Logistik/button_Masuk (2)\'))\n\nWebUI.mouseOver(findTestObject(\'Object Repository/Page_Patra Logistik/div_Patra Logistik\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Patra Logistik/span_Overview\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Patra Logistik/input_Overview Bulan Januari 2025_dateFilter\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Patra Logistik/svg\'))\n\nWebUI.delay(1)\n\nWebUI.click(findTestObject(\'Object Repository/Page_Patra Logistik/span_Oktober\'))\n\nWebUI.delay(1)\n\nrow1 = WebUI.getText(findTestObject(\'Object Repository/Page 1 Values/row 1\'))\n\nWebUI.verifyEqual(row1, \'27.806,00\', FailureHandling.CONTINUE_ON_FAILURE)\n\n', FailureHandling.STOP_ON_FAILURE, true)

