//
//  ViewController.swift
//  LoggerApp
//
//  Created by Naresh on 08/05/20.
//  Copyright © 2020 Naresh. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        let result = LoggerStaticLibrary.addTwoNumbers(10, 20);
        print("Result : \(result)")
        print(LoggerStaticLibrary.greetUser("Naresh")!);
        LoggerStaticLibrary.logInLibrary();
    }
}

