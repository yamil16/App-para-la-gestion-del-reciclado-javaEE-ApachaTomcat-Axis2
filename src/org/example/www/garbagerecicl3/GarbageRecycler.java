package org.example.www.garbagerecicl3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GarbageRecycler {

	private static HashMap<String,User> usuariosRegistrados = new HashMap<String,User>();
	//private HashMap<User, ArrayList<Recycling>> recicladoXusuario;
	private static HashMap<User, ArrayList<UserRecycling>> recicladoXusuario= new HashMap<User, ArrayList<UserRecycling>>() ;
	
	public User RegistrarUsuario(User u) {
		if (usuariosRegistrados.containsKey(u.getUserName())) {
			System.out.println("Ya existe un usuario con el id "+u.getId());
			return null;
		}
		else {					
			usuariosRegistrados.put(u.getUserName(), u);
			return u;
		}				
	}
	
	public ArrayList<UserRecycling>  AgregarReclicadoUsuario(String userName, UserRecycling uR) {
		
		User usuario=usuariosRegistrados.get(userName);
		
		if (usuario!=null) {
			
			ArrayList<UserRecycling> listaReciclado= recicladoXusuario.get(usuario);
			//Recycling reciclado = new Recycling();
			//reciclado.set
		
			
			
			if(listaReciclado==null) {
				listaReciclado = new ArrayList<UserRecycling>();
			}
			else {
				for(UserRecycling u: listaReciclado) {
					if(u.getId()==uR.getId()) {
						System.out.println("Ya existe un reciclado con el id "+u.getId());
						return null;
					}
				}
			}
			listaReciclado.add(uR);
			recicladoXusuario.put(usuario,listaReciclado);
	
			return listaReciclado;
		}
		else {
			System.out.println("No existe el usuario: "+userName);
			return null;
		}
		
		
		
	}
	public ArrayList<UserRecycling> obtenerTodosRecicladosUsuario(String userName){
		//ArrayList<UserRecycling> resultadoReciclado= new ArrayList<UserRecycling>();
		User usuario=usuariosRegistrados.get(userName);
		if (usuario != null) {
			ArrayList<UserRecycling> listaReciclado= recicladoXusuario.get(usuario);
			return listaReciclado;
		}
		else
			return null;		
		
	}
	public Recycling obtenerTotalReciclado(){ //hay que sacar username
		Set<User>clavesMap=recicladoXusuario.keySet();
		int tetrabrick=0;
		int carton=0;
		int vidrio=0;
		int botella=0;		
		for (User user : clavesMap) {
			String nombreUsuario =user.getUserName();
			ArrayList<UserRecycling> totalRecicladoUsuario=obtenerTodosRecicladosUsuario( nombreUsuario);
			for (UserRecycling userReciclado : totalRecicladoUsuario) {
				tetrabrick+=userReciclado.getTetrabrick();
				carton+=userReciclado.getCarton();
				vidrio+=userReciclado.getVidrio();
				botella+=userReciclado.getBotella();
				
			}
		}
		Recycling totalReciclado = new Recycling();
		totalReciclado.setBotella(botella);
		totalReciclado.setCarton(carton);
		totalReciclado.setTetrabrick(tetrabrick);
		totalReciclado.setVidrio(vidrio);
		totalReciclado.setTonelada(botella+carton+tetrabrick+vidrio);
		return totalReciclado;
	}
	
	
	
	
}
