package com.company.controller;

import com.company.model.LoginInputException;
import com.company.model.Model;
import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.controller.RegexContainer.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;

/**
 * Created by student on 26.09.2017.
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private Model model;


    public InputNoteNoteBook(View view,Model model,  Scanner sc) {
        this.view = view;
        this.model = model;
        this.sc = sc;
    }

       public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
              ? REGEX_NAME_UKR : REGEX_NAME_LAT;
           while (true) {
               try {
                   model.addNewUserToMap(utilityController.inputStringValueWithScanner
                           (LOGIN_DATA, REGEX_LOGIN), utilityController.inputStringValueWithScanner
                           (FIRST_NAME, str));
                   break;
               } catch (LoginInputException e) {
                   view.printBundleMessage(LOGIN_INPUT_EXCEPTION);
               }
           }
    }
}
