package com.wintersoldier.jms

import javax.jms.{MapMessage, ObjectMessage, StreamMessage, TextMessage}

import scala.beans.BeanProperty

case class JmsMessage( @BeanProperty content:String, @BeanProperty correlationId:String, @BeanProperty jmsType:String,@BeanProperty messageId:String , @BeanProperty queue:String)


object JmsMessage {
    
    def apply(message:TextMessage): JmsMessage =
        new JmsMessage(message.getText, message.getJMSCorrelationID, message.getJMSType, message.getJMSMessageID,message.getJMSDestination.toString)
    
    def apply(message:MapMessage): JmsMessage = null
    
    def apply(message:ObjectMessage): JmsMessage = null
    
    def apply(message:StreamMessage): JmsMessage = null
    
    def apply(): JmsMessage = null
    
}