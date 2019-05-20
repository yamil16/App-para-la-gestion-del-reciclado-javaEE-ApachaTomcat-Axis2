
/**
 * GarbageRecicl3Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.garbagerecicl3;

import java.util.ArrayList;


/**
     *  GarbageRecicl3Skeleton java skeleton for the axisService
     */
    public class GarbageRecicl3Skeleton{
    	static GarbageRecycler garbageRec = new GarbageRecycler();
         
        /**
         * Auto generated method signature
         * 
                                     * @param getAllRecyclingByUser 
             * @return getAllRecyclingByUserResponse 
         */
        
                 public org.example.www.garbagerecicl3.GetAllRecyclingByUserResponse getAllRecyclingByUser
                  (
                  org.example.www.garbagerecicl3.GetAllRecyclingByUser getAllRecyclingByUser
                  )
            {
                //TODO : fill this with the necessary business logic
                	 
                	 String nombre= getAllRecyclingByUser.getUsername();   
                	 UserRecycling[] salida = null;
                	 ArrayList<UserRecycling> todosReciclados=  garbageRec.obtenerTodosRecicladosUsuario(nombre);
                	 if(todosReciclados.isEmpty()) {
                		 System.out.println("El usuario "+nombre+" no tiene reciclados");
                	 }
                	 else {
                		 System.out.println("Los reciclados para el usuario "+nombre+" son: ");
                		 int tam=todosReciclados.size();
                    	 salida = new UserRecycling[tam];
                    	 int pos=0;
                    	 for (UserRecycling userReciclado : todosReciclados) {
                    		 salida[pos]=userReciclado;
                    		 pos++;
                    		 System.out.println("Vidrio: "+userReciclado.getVidrio()+ " Carton: "+userReciclado.getCarton()+" Botella: "+userReciclado.getBotella()+" Tetrabick:"+userReciclado.getTetrabrick());
                    	 }
                		 
                		 
                		 
                	 }

            		 GetAllRecyclingByUserResponse response = new GetAllRecyclingByUserResponse();
            		 response.setOut(salida);
            		 return response;
                	 
                	 
               // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getAllRecyclingByUser");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param addReciclyngToUser 
             * @return addReciclyngToUserResponse 
         */
        
                 public org.example.www.garbagerecicl3.AddReciclyngToUserResponse addReciclyngToUser
                  (
                  org.example.www.garbagerecicl3.AddReciclyngToUser addReciclyngToUser
                  )
            {
                //TODO : fill this with the necessary business logic
                	 String nombre= addReciclyngToUser.getUsername();
                	 UserRecycling salida = null;
                     UserRecycling uR = addReciclyngToUser.getReciclado();
                     ArrayList<UserRecycling>  urOut =garbageRec.AgregarReclicadoUsuario(nombre, uR);
                    
                     if(urOut==null) {
                    	 System.out.println("No se ha podido agregar reciclado al usuario "+nombre);
                     }
                     else {
                    	 System.out.println("Se ha agregado el reciclado");
                    	 int tam=urOut.size();
                    	 System.out.println("Cantidad de reciclados hasta el momento: "+tam);
                    	 /*int pos=0;
                    	 for (UserRecycling userReciclado : urOut) {
                    		
                    		 pos++;
                    	 }*/
                    	 
                     }
                     
                     AddReciclyngToUserResponse response = new AddReciclyngToUserResponse();
                     response.setOut(uR);
                     return response;	 
               // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#addReciclyngToUser");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getTotalRecycling 
             * @return getTotalRecyclingResponse 
         */
        
                 public org.example.www.garbagerecicl3.GetTotalRecyclingResponse getTotalRecycling
                  (
                  org.example.www.garbagerecicl3.GetTotalRecycling getTotalRecycling
                  )
            {
                //TODO : fill this with the necessary business logic
                	 
                	 
                 	Recycling sal= garbageRec.obtenerTotalReciclado();
                 	if(sal==null) {
                 		System.out.println(" No hay reciclados");
                 	}
                 	else {
                 		 System.out.println("El total de reciclados es: ");
                 		 System.out.println("Vidrio: "+sal.getVidrio()+ " Carton: "+sal.getCarton()+" Botella: "+sal.getBotella()+" Tetrabick:"+sal.getTetrabrick()+ " Tonelada: "+sal.getTonelada());
                 	}
                 	
                 	GetTotalRecyclingResponse salida= new GetTotalRecyclingResponse();
                 	salida.setOut(sal);
                 	return salida; 
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getTotalRecycling");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param registerUser 
             * @return registerUserResponse 
         */
        
                 public org.example.www.garbagerecicl3.RegisterUserResponse registerUser
                  (
                  org.example.www.garbagerecicl3.RegisterUser registerUser
                  )
            {
                //TODO : fill this with the necessary business logic
                	 
                	 User u= registerUser.getIn();     	
                	 User us2= garbageRec.RegistrarUsuario(u);
                	 if (us2!=null)
                		 System.out.println("Se registro el usuario "+u.getUserName());
                	 else
                		 System.out.println("No se pudo registrar el usuario "+u.getUserName());
                     RegisterUserResponse response = new RegisterUserResponse();
                     response.setOut(u);
                     return response;
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#registerUser");
        }
     
    }
    