package com.suntech.intelliswaut.selenium.actions.general

class Wait{
  
  public run(def params){
    if(params.Seconds){
    	sleep(params.Seconds.toInteger() * 1000)  
    }    
  }
}