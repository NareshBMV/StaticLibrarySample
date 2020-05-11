//
//  LoggerStaticLibrary.h
//  LoggerStaticLibrary
//
//  Created by Naresh on 08/05/20.
//  Copyright © 2020 Naresh. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface LoggerStaticLibrary : NSObject

+(NSString *)greetUser:(NSString *)userName;
+(void)logInLibrary;
+(int)addTwoNumbers:(int)num1 :(int)num2;

@end
