
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.example.www.garbagerecicl3;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/GarbageRecicl3/".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  org.example.www.garbagerecicl3.User.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/GarbageRecicl3/".equals(namespaceURI) &&
                  "Recycling".equals(typeName)){
                   
                            return  org.example.www.garbagerecicl3.Recycling.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/GarbageRecicl3/".equals(namespaceURI) &&
                  "UserRecycling".equals(typeName)){
                   
                            return  org.example.www.garbagerecicl3.UserRecycling.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    