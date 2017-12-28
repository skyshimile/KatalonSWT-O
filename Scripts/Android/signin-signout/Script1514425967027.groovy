import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/arnandadw/Downloads/sc_dev_2017-12-22.apk', true)

Mobile.tap(findTestObject('Sweatcircle/android.view.View10'), 0)

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText0 - Email'), 'tiara@skyshi.io', 0)

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText1'), '54321', 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View7'), 0)

WebUI.waitForPageLoad(0)

Mobile.switchToPortrait()

not_run: Mobile.tap(findTestObject('Sweatcircle/android.view.View22'), 0)

not_run: Mobile.tap(findTestObject('Sweatcircle/android.view.View19'), 0)

not_run: Mobile.closeApplication()

