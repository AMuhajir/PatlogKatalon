import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stag-patra-logistik.azuralabs.id/login')

WebUI.setText(findTestObject('Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_113d72 (2)'), 
    'patlog_manajemen')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_POC Patra Logistik/input_Silahkan Login Untuk Mengakses Aplika_648cb7 (2)'), 
    'Tl/nWPU0V52MQE+2jGH8/HDzEI2YIzZ4')

WebUI.click(findTestObject('Object Repository/Page_POC Patra Logistik/button_Masuk (2)'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Patra Logistik/div_Patra Logistik (1)'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/span_Overview (1)'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/input_Overview Bulan Januari 2025_dateFilter (1)'))

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/svg (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Patra Logistik/span_Oktober (1)'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '27.806,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2, FailureHandling.STOP_ON_FAILURE)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '10.958,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '4.950,52', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '4.339,44', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '3.968,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '3.740,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '2.951,60', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '1.640,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '1.543,46', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '1.238,12', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '1.212,50', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '961,66', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '921,36', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '880,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '769,81', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '700,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '655,84', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '642,90', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '632,57', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '612,28', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '605,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '516,71', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '502,95', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '495,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '478,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '474,21', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '473,54', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '450,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '420,12', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '414,70', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '406,50', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '315,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '285,97', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '269,50', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '245,84', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '220,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '176,98', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '110,44', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '60,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '50,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '40,15', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '32,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '31,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '24,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '16,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 1'), 2)

row1 = WebUI.getText(findTestObject('Overview Page Values/row 1'))

WebUI.verifyEqual(row1, '8,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 2'), 2)

row2 = WebUI.getText(findTestObject('Overview Page Values/row 2'))

WebUI.verifyEqual(row2, '4,56', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 3'), 2)

row3 = WebUI.getText(findTestObject('Overview Page Values/row 3'))

WebUI.verifyEqual(row3, '4.950,52', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 4'), 2)

row4 = WebUI.getText(findTestObject('Overview Page Values/row 4'))

WebUI.verifyEqual(row4, '4.339,44', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Overview Page Values/row 5'), 2)

row5 = WebUI.getText(findTestObject('Overview Page Values/row 5'))

WebUI.verifyEqual(row5, '3.968,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Overview Page Values/next page button'))

WebUI.click(findTestObject('Overview Page Values/next page button'))

