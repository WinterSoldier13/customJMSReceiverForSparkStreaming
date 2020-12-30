package com.wintersoldier.jms

import javax.jms.ConnectionFactory
import org.apache.activemq.ActiveMQConnectionFactory


trait ConnectionFactoryProvider {
    def createConnection(options:Map[String,String]):ConnectionFactory
}

class AMQConnectionFactoryProvider extends ConnectionFactoryProvider {
    
    override def createConnection(options: Map[String, String]): ConnectionFactory = {
        new ActiveMQConnectionFactory
    }
}

