//
//  LoggerStaticLibrary.m
//  LoggerStaticLibrary
//
//  Created by Naresh on 08/05/20.
//  Copyright © 2020 Naresh. All rights reserved.
//

#import "LoggerStaticLibrary.h"

@implementation LoggerStaticLibrary

+(NSString *)greetUser:(NSString *)userName{
    return [NSString stringWithFormat:@"Hi %@ welcome to Edgeverve",userName];
}

+(void)logInLibrary {
    NSLog(@"You are inside Library!!! Method");
}

+(int)addTwoNumbers:(int)num1 :(int)num2 {
    return num1+num2;
}

@end
