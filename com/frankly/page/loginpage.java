package com.frankly.page;

import java.io.IOException;
import org.json.JSONException;
import org.junit.Assert;

import com.frankly.base.Keywords;
public class loginpage extends Keywords {
	public void setupForInitialize() throws JSONException{
		try {
			InstallApp();
			propertyFileinitialize();
		} catch (IOException e) {
			APP_LOGS.info(e.getMessage());
	}
	}
	public void verifyerrormessage(String GetStartedBtnName,
			String UserNameTextFieldXpath,
			String InvalidUserName,
			String SignUp_ErrorMessageName,
			String SignUpErrorMessgae){
		try{
			clickByName(GetStartedBtnName);
			writeTextByXpath(UserNameTextFieldXpath,InvalidUserName);
			validateExpectedText(SignUp_ErrorMessageName,SignUpErrorMessgae);
		Assert.assertTrue(validateExpectedText(SignUp_ErrorMessageName,SignUpErrorMessgae));
		}catch(Exception e){
			APP_LOGS.info(e.getMessage());
		}
	}
	public void errwithinvalidcredential(String LoginBtnName,
			String UserNameTextFieldXpath,
			String InValidUserName,
			String NextBtn_Name,
			String LoginPasswordTextFieldXpath,
			String InvalidPassword,
			String ErrorMessageforInvalidCre,
			String invalidCreErrorMessage,
			String BackBtnXpath){
		try{
			clickByName(LoginBtnName);
			clickByXpath(UserNameTextFieldXpath);
			writeTextByXpath(UserNameTextFieldXpath,InValidUserName);
			clickByName(NextBtn_Name);
			writeTextByXpath(LoginPasswordTextFieldXpath,InvalidPassword);
			clickByName(NextBtn_Name);
			Assert.assertTrue(validateExpectedText(ErrorMessageforInvalidCre,invalidCreErrorMessage));
			clickByXpath(BackBtnXpath);
		}catch(Exception e){
			APP_LOGS.info(e.getMessage());
		}
	}
	public void loginwithValid(
			String LoginBtnName,
			String UserNameTextFieldXpath,
			String UserName,
			String NextBtn_Name,
			String LoginPasswordTextFieldXpath,
			String Password) throws InterruptedException{
		clickByName(LoginBtnName);
		clickByXpath(UserNameTextFieldXpath);
		writeTextByXpath(UserNameTextFieldXpath,UserName);
		clickByName(NextBtn_Name);
		writeTextByXpath(LoginPasswordTextFieldXpath,Password);
		clickByName(NextBtn_Name);
	}
	public void terminateDriver(){
		try{
			terminatedriver();
		}catch(Exception e){
			APP_LOGS.info(e.getMessage());
		}
	}
	

}
