
/**
 * GarbageRecicl3MessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.garbagerecicl3;

        /**
        *  GarbageRecicl3MessageReceiverInOut message receiver
        */

        public class GarbageRecicl3MessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GarbageRecicl3Skeleton skel = (GarbageRecicl3Skeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getAllRecyclingByUser".equals(methodName)){
                
                org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse getAllRecyclingByUserResponse17 = null;
	                        org.example.www.garbagerecicl3.GetAllRecyclingByUser wrappedParam =
                                                             (org.example.www.garbagerecicl3.GetAllRecyclingByUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecicl3.GetAllRecyclingByUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllRecyclingByUserResponse17 =
                                                   
                                                   
                                                         skel.getAllRecyclingByUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllRecyclingByUserResponse17, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecicl3/",
                                                    "getAllRecyclingByUser"));
                                    } else 

            if("addReciclyngToUser".equals(methodName)){
                
                org.example.www.garbagerecicl3.AddReciclyngToUserResponse addReciclyngToUserResponse19 = null;
	                        org.example.www.garbagerecicl3.AddReciclyngToUser wrappedParam =
                                                             (org.example.www.garbagerecicl3.AddReciclyngToUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecicl3.AddReciclyngToUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addReciclyngToUserResponse19 =
                                                   
                                                   
                                                         skel.addReciclyngToUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addReciclyngToUserResponse19, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecicl3/",
                                                    "addReciclyngToUser"));
                                    } else 

            if("getTotalRecycling".equals(methodName)){
                
                org.example.www.garbagerecicl3.GetTotalRecyclingResponse getTotalRecyclingResponse21 = null;
	                        org.example.www.garbagerecicl3.GetTotalRecycling wrappedParam =
                                                             (org.example.www.garbagerecicl3.GetTotalRecycling)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecicl3.GetTotalRecycling.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTotalRecyclingResponse21 =
                                                   
                                                   
                                                         skel.getTotalRecycling(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTotalRecyclingResponse21, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecicl3/",
                                                    "getTotalRecycling"));
                                    } else 

            if("registerUser".equals(methodName)){
                
                org.example.www.garbagerecicl3.RegisterUserResponse registerUserResponse23 = null;
	                        org.example.www.garbagerecicl3.RegisterUser wrappedParam =
                                                             (org.example.www.garbagerecicl3.RegisterUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecicl3.RegisterUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerUserResponse23 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerUserResponse23, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecicl3/",
                                                    "registerUser"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.GetAllRecyclingByUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.GetAllRecyclingByUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.AddReciclyngToUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.AddReciclyngToUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.AddReciclyngToUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.AddReciclyngToUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.GetTotalRecycling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.GetTotalRecycling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.GetTotalRecyclingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.GetTotalRecyclingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.RegisterUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.RegisterUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecicl3.RegisterUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecicl3.RegisterUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse wrapgetAllRecyclingByUser(){
                                org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse wrappedElement = new org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecicl3.AddReciclyngToUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecicl3.AddReciclyngToUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecicl3.AddReciclyngToUserResponse wrapaddReciclyngToUser(){
                                org.example.www.garbagerecicl3.AddReciclyngToUserResponse wrappedElement = new org.example.www.garbagerecicl3.AddReciclyngToUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecicl3.GetTotalRecyclingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecicl3.GetTotalRecyclingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecicl3.GetTotalRecyclingResponse wrapgetTotalRecycling(){
                                org.example.www.garbagerecicl3.GetTotalRecyclingResponse wrappedElement = new org.example.www.garbagerecicl3.GetTotalRecyclingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecicl3.RegisterUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecicl3.RegisterUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecicl3.RegisterUserResponse wrapregisterUser(){
                                org.example.www.garbagerecicl3.RegisterUserResponse wrappedElement = new org.example.www.garbagerecicl3.RegisterUserResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.garbagerecicl3.GetAllRecyclingByUser.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.GetAllRecyclingByUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecicl3.AddReciclyngToUser.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.AddReciclyngToUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecicl3.AddReciclyngToUserResponse.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.AddReciclyngToUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecicl3.GetTotalRecycling.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.GetTotalRecycling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecicl3.GetTotalRecyclingResponse.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.GetTotalRecyclingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecicl3.RegisterUser.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.RegisterUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecicl3.RegisterUserResponse.class.equals(type)){
                
                           return org.example.www.garbagerecicl3.RegisterUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    