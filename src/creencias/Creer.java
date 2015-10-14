
package creencias;

public class Creer {
    
    
    
    int adv[] = new int[28];
    
    String fund[] = new String[28];
    { 
    fund[0] = " 1. Las Sagradas Escrituras";
     fund[1] = "2. La Trinidad";
     fund[2] = "3. Dios Padre";
     fund[3] = "4. Dios Hijo";
     fund[4] = "5. Dios Espíritu Santo";
     fund[5] = "6. Dios es el Creador";
     fund[6] = "7. La Naturaleza del Hombre";
     fund[7] = "8. El Gran Conflicto";
     fund[8] = "9. Vida, Muerte y Ressurrección de Cristo";
     fund[9] = "10. La Experiencia de la Salvación";
     fund[10] = "11. El crecimiento en Cristo";
     fund[11] = "12. La Iglesia";
     fund[12] = "13. El Remaneciente y su Misión";
     fund[13] = "14. Unidad en el Cuerpo de Cristo";
     fund[14] = "15. El Bautismo";
     fund[15] = "16. La Cena del Señor";
     fund[16] = "17. Dones y Ministerios Espirituales";
     fund[17] = "18. El Don de Profecía";
     fund[18] = "19. La Ley de Dios";
     fund[19] = "20. El Sábado";
     fund[20] = "21. Mayordomía";
     fund[21] = "22. Conducta Cristiana";
     fund[22] = "23. Matrimonio y la Familia";
     fund[23] = "24. El Ministerio de Cristo en el Santuario Celestial";
     fund[24] = "25. La Segunda Venida de Cristo";
     fund[25] = "26. Muerte y la Resurrección";
     fund[26] = "27. El Milenio y el Fin del Pecado";
     fund[27] = "28. La Nueva Tierra";  
    }
    
    {
     adv[0] = 1;
     adv[1] = 2;
     adv[2] = 3;
     adv[3] = 4;
     adv[4] = 5;
     adv[5] = 6;
     adv[6] = 7;
     adv[7] = 8;
     adv[8] = 9;
     adv[9] = 10;
     adv[10] = 11;
     adv[11] = 12;
     adv[12] = 13;
     adv[13] = 14;
     adv[14] = 15;
     adv[15] = 16;
     adv[16] = 17;
     adv[17] = 18;
     adv[18] = 19;
     adv[19] = 20;
     adv[20] = 21;
     adv[21] = 22;
     adv[22] = 23;
     adv[23] = 24;
     adv[24] = 25;
     adv[25] = 26;
     adv[26] = 27;
     adv[27] = 28;
    } 
    
    public String avn(int a){
        for (int t = 0; t < 27; t++) {
            for (int q = t+1; q < 28; q++) {
                
                if (adv[t]>adv[q]){
                    
                    
                    int hor = adv[t];
                 adv[t] = adv[q];
                 adv[q] = hor;
                 
                     String vent = fund[t];
                     fund[t] = fund[q];
                     fund[q] = vent;
                }
                
            }
            
        }
        
    return fund[a] ;  
    }
   
    
    public String cruz(int a){
       for (int t = 0; t < 27; t++) {
            for (int q = t+1; q < 28; q++) {
                
                if (adv[t]<adv[q]){
                    
                    
                    int hor = adv[t];
                 adv[t] = adv[q];
                 adv[q] = hor;
                 
                     String vent = fund[t];
                     fund[t] = fund[q];
                     fund[q] = vent;  
        
    }
            }
    }
       return fund[a];
    }
}

       
