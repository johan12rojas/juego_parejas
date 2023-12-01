package juego_parejas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class juego extends javax.swing.JFrame {
        
        metodos op=new metodos();
        
        
        //VARIABLES UTILIZADAS PARA EL CODIGO
        int[] numeros;
        int turn;
        int puntaje;
        boolean Ganador = false;
        
        //PUBLICAS
        public int mostrarcara = 0;
        public boolean[] activo = new boolean[3];
        public ImageIcon[] imagen = new ImageIcon[3];
        public JButton[] Bt = new JButton[3];
       

        public juego(int turn, int puntaje) {
        this.turn = turn;
        this.puntaje = puntaje;
        }
        
        public int getTurno() {
        return turn;
        }
        
        public int getPuntaje() {
        return puntaje;
        }
        
        public void setTurno(int turn) {
        this.turn = turn;
        }

        public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
        }
        
        public juego() {
      
        initComponents();
        
        //CENTRAR JFRAME Y TAMAÑO DE PIXELES PARA REDIMENSIONAR LUEGO
        this.setLocationRelativeTo(null); setSize(800, 600);
        
        //METODOS DE FECHA Y HORA
        mostrarfecha();mostrarhora();
        
        //METODO PARA ASIGNAR LAS IMAGENES A CADA BOTON
        asignarImagen();
       
        //OCULTAR EL MENU DE MUSICA 
        CANCIONES.setVisible(false);
        REPRODUCIR.setVisible(false);
        
        //IMPORTAR EL NOMBRE DEL JUGADOR DEL PRIMER JFRAME
        play nombres=new play();
        NOMBRE.setText("JUGADOR "+play.nombre);
    
        }   
        
        //METODO PARA ASIGNAR LAS IMAGENES USANDO EL METODO DE RANDOMS 
        private void asignarImagen(){
    
        numeros=op.ObtenerNumeroCartas();
    
        a1.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[0] + ".png")));
        a2.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[1] + ".png")));
        a3.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[2] + ".png")));
        a4.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[3] + ".png")));
        a5.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[4] + ".png")));
        a6.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[5] + ".png")));
        a7.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[6] + ".png")));
        a8.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[7] + ".png")));
        a9.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[8] + ".png")));
        a10.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[9] + ".png")));
        a11.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[10] + ".png")));
        a12.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[11] + ".png")));
        a13.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[12] + ".png")));
        a14.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[13] + ".png")));
        a15.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[14] + ".png")));
        a16.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[15] + ".png")));
        a17.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[16] + ".png")));
        a18.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[17] + ".png")));
        a19.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[18] + ".png")));
        a20.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[19] + ".png")));
        a21.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[20] + ".png")));
        a22.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[21] + ".png")));
        a23.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[22] + ".png")));
        a24.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[23] + ".png")));
        a25.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[24] + ".png")));
        a26.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[25] + ".png")));
        a27.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[26] + ".png")));
        a28.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[27] + ".png")));
        a29.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[28] + ".png")));
        a30.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[29] + ".png")));
        a31.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[30] + ".png")));
        a32.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[31] + ".png")));
        a33.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[32] + ".png")));
        a34.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[33] + ".png")));
        a35.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[34] + ".png")));
        a36.setDisabledIcon(new ImageIcon(getClass().getResource("/iparejas/" + numeros[35] + ".png")));
    }
        
        
        //METODO PARA VERIFICAR QUE ACCION REALIZAR DEPENDIENDO LAS IMAGENES
        public void VERIFICAR_IMAGENES(JTextField Turno, JTextField Puntaje) {
        if (mostrarcara == 1) {
            if (imagen[0].getDescription().equals(imagen[1].getDescription())) {
            } else {
                for (int i = 0; i < 2; i++) {
                    Bt[i].setEnabled(true);
                    activo[i] = false;
                }
                setTurno(getTurno() + 1);
                Turno.setText(String.valueOf(getTurno()));
                mostrarcara = 0;
            }
        }
        if (mostrarcara == 2) {
            if (imagen[0].getDescription().equals(imagen[1].getDescription()) && imagen[1].getDescription().equals(imagen[2].getDescription())) {
                for (int i = 0; i < 3; i++) {
                    Bt[i].setEnabled(false);
                    activo[i] = false;
                }
                setPuntaje(getPuntaje() + 1);
                Puntaje.setText(String.valueOf(getPuntaje()));
                setTurno(getTurno() + 1);
                Turno.setText(String.valueOf(getTurno()));
                
                if (puntaje == 12) {
                    Ganador = true;
                    op.Ganar(Ganador, this);
                    FIN abc=new FIN();
                    abc.setVisible(true);
                    juego.this.dispose();
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    Bt[i].setEnabled(true);
                    activo[i] = false;
                }
                setTurno(getTurno() + 1);
                Turno.setText(String.valueOf(getTurno()));
            }
            mostrarcara = 0;
        }
         }
    
        public void MostrarBoton(JButton boton) {
        int Indice = 0;
        for (int a = 0; a < 3; a++) {
            if (!activo[a]) {
                boton.setEnabled(false);
                imagen[a] = (ImageIcon) boton.getDisabledIcon();
                Bt[a] = boton;
                activo[a] = true;
                Indice = a;
                break;
            }
        }
        if (Indice == 1) {
            mostrarcara = 1;
        }
        if (Indice == 2) {
            mostrarcara = 2;
        }
        }
    
        //METODO PARA MOSTRAR LAS FICHAS POR 3 SEGUNDOS
        public void voltearfichas(){
    
        Timer tiempo =new Timer();
        TimerTask tiempoespera=new TimerTask(){
        int numerito=0;

        public void run() {
		
        if(numerito==0){
        a1.setEnabled(false);a2.setEnabled(false);a3.setEnabled(false);a4.setEnabled(false);a5.setEnabled(false);a6.setEnabled(false);a7.setEnabled(false);a8.setEnabled(false);
        a9.setEnabled(false);a10.setEnabled(false);a11.setEnabled(false);a12.setEnabled(false);a13.setEnabled(false);a14.setEnabled(false);a15.setEnabled(false);a16.setEnabled(false);
        a17.setEnabled(false);a18.setEnabled(false);a19.setEnabled(false);a20.setEnabled(false);a21.setEnabled(false);a22.setEnabled(false);a23.setEnabled(false);a24.setEnabled(false);
        a25.setEnabled(false);a26.setEnabled(false);a27.setEnabled(false);a28.setEnabled(false);a29.setEnabled(false);a30.setEnabled(false);a31.setEnabled(false);a32.setEnabled(false);
        a33.setEnabled(false);a34.setEnabled(false);a35.setEnabled(false);a36.setEnabled(false);
        
}else if(numerito==1){

        a1.setEnabled(true);a2.setEnabled(true);a3.setEnabled(true);a4.setEnabled(true);a5.setEnabled(true);a6.setEnabled(true);a7.setEnabled(true);a8.setEnabled(true);
        a9.setEnabled(true);a10.setEnabled(true);a11.setEnabled(true);a12.setEnabled(true);a13.setEnabled(true);a14.setEnabled(true);a15.setEnabled(true);a16.setEnabled(true);
        a17.setEnabled(true);a18.setEnabled(true);a19.setEnabled(true);a20.setEnabled(true);a21.setEnabled(true);a22.setEnabled(true);a23.setEnabled(true);a24.setEnabled(true);
        a25.setEnabled(true);a26.setEnabled(true);a27.setEnabled(true);a28.setEnabled(true);a29.setEnabled(true);a30.setEnabled(true);a31.setEnabled(true);a32.setEnabled(true);
        a33.setEnabled(true);a34.setEnabled(true);a35.setEnabled(true);a36.setEnabled(true);

    }numerito++;
        
    }    

    };tiempo.schedule(tiempoespera,1000,3000);}
    
        //METODO PARA MOSTRAR LA FECHA
        public void mostrarfecha(){
        op.metodofecha(xd);}
    
        //METODO PARA MOSTRAR LA HORA
        public void mostrarhora(){
    op.metodohora(xd1);}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        movimientos = new javax.swing.JTextField();
        Puntaje = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        xd1 = new javax.swing.JLabel();
        xd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a15 = new javax.swing.JButton();
        a16 = new javax.swing.JButton();
        a17 = new javax.swing.JButton();
        a18 = new javax.swing.JButton();
        a19 = new javax.swing.JButton();
        a20 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a23 = new javax.swing.JButton();
        a24 = new javax.swing.JButton();
        a25 = new javax.swing.JButton();
        a26 = new javax.swing.JButton();
        a27 = new javax.swing.JButton();
        a28 = new javax.swing.JButton();
        a29 = new javax.swing.JButton();
        a30 = new javax.swing.JButton();
        a31 = new javax.swing.JButton();
        a32 = new javax.swing.JButton();
        a33 = new javax.swing.JButton();
        a34 = new javax.swing.JButton();
        a35 = new javax.swing.JButton();
        a36 = new javax.swing.JButton();
        separador = new javax.swing.JLabel();
        CANCIONES = new javax.swing.JComboBox<>();
        REPRODUCIR = new javax.swing.JButton();
        Turno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FECHA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 150, -1));

        movimientos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        movimientos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        movimientos.setOpaque(true);
        movimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movimientosActionPerformed(evt);
            }
        });
        getContentPane().add(movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 70, 60));

        Puntaje.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        Puntaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Puntaje.setText("0");
        Puntaje.setOpaque(true);
        Puntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntajeActionPerformed(evt);
            }
        });
        getContentPane().add(Puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 70, 60));

        NOMBRE.setBackground(new java.awt.Color(51, 51, 51));
        NOMBRE.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        NOMBRE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NOMBRE.setOpaque(true);
        getContentPane().add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 250, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HORA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 150, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALT +f = PANEL DE PUNTOS  / ALT + i= AYUDA DEL JUEGO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 360, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PUNTAJE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, 70, -1));

        xd1.setBackground(new java.awt.Color(255, 255, 255));
        xd1.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        xd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xd1.setOpaque(true);
        getContentPane().add(xd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 150, 30));

        xd.setBackground(new java.awt.Color(255, 255, 255));
        xd.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        xd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xd.setOpaque(true);
        getContentPane().add(xd, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 150, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/R-2551371-1290053449-removebg-preview (1).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, null, java.awt.Color.red, java.awt.Color.green));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 90, 90));

        mostrar.setBackground(new java.awt.Color(51, 255, 51));
        mostrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        mostrar.setForeground(new java.awt.Color(0, 0, 0));
        mostrar.setText("SHOW");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 80, 30));

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLAY MUSIC");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 220, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TURNO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 70, -1));

        jButton3.setBackground(new java.awt.Color(51, 0, 204));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton3.setText("CLEAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 80, 30));

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 70, 30));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(6, 6));

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a1MousePressed(evt);
            }
        });
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel1.add(a1);

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a2MouseExited(evt);
            }
        });
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jPanel1.add(a2);

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a3MouseExited(evt);
            }
        });
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jPanel1.add(a3);

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a4MouseExited(evt);
            }
        });
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        jPanel1.add(a4);

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a5MouseExited(evt);
            }
        });
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        jPanel1.add(a5);

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a6MouseExited(evt);
            }
        });
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });
        jPanel1.add(a6);

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a7MouseExited(evt);
            }
        });
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });
        jPanel1.add(a7);

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a8MouseExited(evt);
            }
        });
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        jPanel1.add(a8);

        a9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a9MouseExited(evt);
            }
        });
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });
        jPanel1.add(a9);

        a10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a10MouseExited(evt);
            }
        });
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });
        jPanel1.add(a10);

        a11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a11MouseExited(evt);
            }
        });
        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });
        jPanel1.add(a11);

        a12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a12MouseExited(evt);
            }
        });
        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });
        jPanel1.add(a12);

        a13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a13MouseExited(evt);
            }
        });
        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });
        jPanel1.add(a13);

        a14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a14MouseExited(evt);
            }
        });
        a14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14ActionPerformed(evt);
            }
        });
        jPanel1.add(a14);

        a15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a15MouseExited(evt);
            }
        });
        a15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a15ActionPerformed(evt);
            }
        });
        jPanel1.add(a15);

        a16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a16MouseExited(evt);
            }
        });
        a16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a16ActionPerformed(evt);
            }
        });
        jPanel1.add(a16);

        a17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a17MouseExited(evt);
            }
        });
        a17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a17ActionPerformed(evt);
            }
        });
        jPanel1.add(a17);

        a18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a18MouseExited(evt);
            }
        });
        a18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a18ActionPerformed(evt);
            }
        });
        jPanel1.add(a18);

        a19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a19MouseExited(evt);
            }
        });
        a19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a19ActionPerformed(evt);
            }
        });
        jPanel1.add(a19);

        a20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a20MouseExited(evt);
            }
        });
        a20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a20ActionPerformed(evt);
            }
        });
        jPanel1.add(a20);

        a21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a21MouseExited(evt);
            }
        });
        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });
        jPanel1.add(a21);

        a22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a22MouseExited(evt);
            }
        });
        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });
        jPanel1.add(a22);

        a23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a23MouseExited(evt);
            }
        });
        a23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23ActionPerformed(evt);
            }
        });
        jPanel1.add(a23);

        a24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a24MouseExited(evt);
            }
        });
        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });
        jPanel1.add(a24);

        a25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a25MouseExited(evt);
            }
        });
        a25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a25ActionPerformed(evt);
            }
        });
        jPanel1.add(a25);

        a26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a26MouseExited(evt);
            }
        });
        a26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a26ActionPerformed(evt);
            }
        });
        jPanel1.add(a26);

        a27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a27MouseExited(evt);
            }
        });
        a27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a27ActionPerformed(evt);
            }
        });
        jPanel1.add(a27);

        a28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a28MouseExited(evt);
            }
        });
        a28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a28ActionPerformed(evt);
            }
        });
        jPanel1.add(a28);

        a29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a29MouseExited(evt);
            }
        });
        a29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a29ActionPerformed(evt);
            }
        });
        jPanel1.add(a29);

        a30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a30MouseExited(evt);
            }
        });
        a30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a30ActionPerformed(evt);
            }
        });
        jPanel1.add(a30);

        a31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a31MouseExited(evt);
            }
        });
        a31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31ActionPerformed(evt);
            }
        });
        jPanel1.add(a31);

        a32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a32MouseExited(evt);
            }
        });
        a32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32ActionPerformed(evt);
            }
        });
        jPanel1.add(a32);

        a33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a33MouseExited(evt);
            }
        });
        a33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33ActionPerformed(evt);
            }
        });
        jPanel1.add(a33);

        a34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a34MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a34MousePressed(evt);
            }
        });
        a34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34ActionPerformed(evt);
            }
        });
        jPanel1.add(a34);

        a35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a35MouseExited(evt);
            }
        });
        a35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a35ActionPerformed(evt);
            }
        });
        jPanel1.add(a35);

        a36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-22 121634.png"))); // NOI18N
        a36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageonline-co-glowimage.png"))); // NOI18N
        a36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a36MouseExited(evt);
            }
        });
        a36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a36ActionPerformed(evt);
            }
        });
        jPanel1.add(a36);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 500));

        separador.setBackground(new java.awt.Color(204, 204, 255));
        separador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nebula_625ochne (3).gif"))); // NOI18N
        separador.setOpaque(true);
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 50, 600));

        CANCIONES.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        CANCIONES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CANCION 1", "CANCION 2", "CANCION 3" }));
        getContentPane().add(CANCIONES, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 150, -1));

        REPRODUCIR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        REPRODUCIR.setText("REPRODUCIR");
        REPRODUCIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPRODUCIRActionPerformed(evt);
            }
        });
        getContentPane().add(REPRODUCIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 560, 160, -1));

        Turno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-23 121108.png"))); // NOI18N
        Turno.setText("jLabel3");
        getContentPane().add(Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 210, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/son-goku-dragon-ball-dragon-ball-super-dragon-ball-super-movie-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 600));

        jButton1.setMnemonic('i');
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 20));

        jButton2.setMnemonic('f');
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 20, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FECHA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FECHA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        op.audio();
        MostrarBoton(a2);
    }//GEN-LAST:event_a2ActionPerformed

    private void a1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1MousePressed

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
        
    }//GEN-LAST:event_a1MouseClicked

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
    op.audio();
    MostrarBoton(a1);
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
    op.audio();
    MostrarBoton(a3);
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
    op.audio();
    MostrarBoton(a4);
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
    op.audio();
    MostrarBoton(a5);
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
    op.audio();
    MostrarBoton(a6);
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
    op.audio();
    MostrarBoton(a7);
    }//GEN-LAST:event_a7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
    op.audio();
    MostrarBoton(a8);
    }//GEN-LAST:event_a8ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
    op.audio();
    MostrarBoton(a9);
    }//GEN-LAST:event_a9ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
    op.audio();
    MostrarBoton(a10);
    }//GEN-LAST:event_a10ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
    op.audio();
    MostrarBoton(a11);
    }//GEN-LAST:event_a11ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
    op.audio();
    MostrarBoton(a12);
    }//GEN-LAST:event_a12ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
    op.audio();
    MostrarBoton(a13);
    }//GEN-LAST:event_a13ActionPerformed

    private void a14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14ActionPerformed
    op.audio();
    MostrarBoton(a14);
    }//GEN-LAST:event_a14ActionPerformed

    private void a15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a15ActionPerformed
     op.audio();
     MostrarBoton(a15);
    }//GEN-LAST:event_a15ActionPerformed

    private void a16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a16ActionPerformed
    op.audio();
    MostrarBoton(a16);
    }//GEN-LAST:event_a16ActionPerformed

    private void a17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a17ActionPerformed
    op.audio();
    MostrarBoton(a17);
    }//GEN-LAST:event_a17ActionPerformed

    private void a18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a18ActionPerformed
    op.audio();
    MostrarBoton(a18);
    }//GEN-LAST:event_a18ActionPerformed

    private void a19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a19ActionPerformed
    op.audio();
    MostrarBoton(a19);
    }//GEN-LAST:event_a19ActionPerformed

    private void a20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a20ActionPerformed
    op.audio();
    MostrarBoton(a20);
    }//GEN-LAST:event_a20ActionPerformed

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
    op.audio();
    MostrarBoton(a21);
    }//GEN-LAST:event_a21ActionPerformed

    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
    op.audio();
    MostrarBoton(a22);
    }//GEN-LAST:event_a22ActionPerformed

    private void a23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23ActionPerformed
    op.audio();
    MostrarBoton(a23);
    }//GEN-LAST:event_a23ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
    op.audio();
    MostrarBoton(a24);
    }//GEN-LAST:event_a24ActionPerformed

    private void a25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a25ActionPerformed
    op.audio();
    MostrarBoton(a25);
    }//GEN-LAST:event_a25ActionPerformed

    private void a26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a26ActionPerformed
    op.audio();
    MostrarBoton(a26);
    }//GEN-LAST:event_a26ActionPerformed

    private void a27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a27ActionPerformed
    op.audio();
    MostrarBoton(a27);
    }//GEN-LAST:event_a27ActionPerformed

    private void a28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a28ActionPerformed
    op.audio();
    MostrarBoton(a28);
    }//GEN-LAST:event_a28ActionPerformed

    private void a29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a29ActionPerformed
    op.audio();
    MostrarBoton(a29);
    }//GEN-LAST:event_a29ActionPerformed

    private void a30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a30ActionPerformed
    op.audio();
    MostrarBoton(a30);
    }//GEN-LAST:event_a30ActionPerformed

    private void a31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31ActionPerformed
    op.audio();
    MostrarBoton(a31);
    }//GEN-LAST:event_a31ActionPerformed

    private void a32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32ActionPerformed
    op.audio();
    MostrarBoton(a32);
    }//GEN-LAST:event_a32ActionPerformed

    private void a33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33ActionPerformed
    op.audio();
    MostrarBoton(a33);
    }//GEN-LAST:event_a33ActionPerformed

    private void a34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34ActionPerformed
    op.audio();
    MostrarBoton(a34);
    }//GEN-LAST:event_a34ActionPerformed

    private void a35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a35ActionPerformed
    op.audio();
    MostrarBoton(a35);
    }//GEN-LAST:event_a35ActionPerformed

    private void a36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a36ActionPerformed
    op.audio();
    MostrarBoton(a36);
    }//GEN-LAST:event_a36ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    op.audio();
    System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     CANCIONES.setVisible(true);
     REPRODUCIR.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        voltearfichas();
        mostrar.setEnabled(false);

     
    }//GEN-LAST:event_mostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String message = "Bienvenido al juego de parejas. En este juego, tu objetivo es encontrar 3 parejas iguales.\n Para jugar, simplemente selecciona dos cartas para ver si son una pareja.\n Si las cartas son iguales, has encontrado una pareja y puedes seguir buscando las otras parejas. \nSi las cartas no son iguales, intenta recordar su posición para encontrar su pareja más tarde.\n ¡Buena suerte y diviértete!";
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setSize(1070, 640);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void a1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a1MouseExited

    private void a2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a2MouseExited

    private void a3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a3MouseExited

    private void a4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a4MouseExited

    private void a5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a5MouseExited

    private void a6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a6MouseExited

    private void a7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a7MouseExited

    private void a8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a8MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a8MouseExited

    private void a9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a9MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a9MouseExited

    private void a10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a10MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a10MouseExited

    private void a11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a11MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a11MouseExited

    private void a12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a12MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a12MouseExited

    private void a13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a13MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a13MouseExited

    private void a14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a14MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a14MouseExited

    private void a15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a15MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a15MouseExited

    private void a16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a16MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a16MouseExited

    private void a17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a17MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a17MouseExited

    private void a18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a18MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a18MouseExited

    private void a19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a19MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a19MouseExited

    private void a20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a20MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a20MouseExited

    private void a21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a21MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a21MouseExited

    private void a22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a22MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a22MouseExited

    private void a23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a23MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a23MouseExited

    private void a24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a24MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a24MouseExited

    private void a25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a25MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a25MouseExited

    private void a26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a26MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a26MouseExited

    private void a27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a27MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a27MouseExited

    private void a28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a28MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a28MouseExited

    private void a29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a29MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a29MouseExited

    private void a30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a30MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a30MouseExited

    private void a31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a31MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a31MouseExited

    private void a32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a32MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a32MouseExited

    private void a33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a33MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a33MouseExited

    private void a34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a34MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34MousePressed

    private void a34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a34MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a34MouseExited

    private void a35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a35MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a35MouseExited

    private void a36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a36MouseExited
        VERIFICAR_IMAGENES(movimientos,Puntaje);
    }//GEN-LAST:event_a36MouseExited

    private void movimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movimientosActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_movimientosActionPerformed

    private void REPRODUCIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPRODUCIRActionPerformed

    String cancion=(String) CANCIONES.getSelectedItem();
    String audi0="";
    
    if (cancion.equalsIgnoreCase("CANCION 1")){
    audi0="C:\\Users\\Johan\\Documents\\NetBeansProjects\\juego_parejas\\src\\audio\\Canción completa de dragon ball super del torneo del poder.wav";
    op.au3(audi0);
    }
    
    if (cancion.equalsIgnoreCase("CANCION 2")){
    audi0="C:\\Users\\Johan\\Documents\\NetBeansProjects\\juego_parejas\\src\\audio\\chala.wav";   
    op.au3(audi0);
    }
    
    if (cancion.equalsIgnoreCase("CANCION 3")){
    audi0="C:\\Users\\Johan\\Documents\\NetBeansProjects\\juego_parejas\\src\\audio\\Dragon Ball - Vamos a buscar las esferas del dragon (Audio Latino).wav";  
    op.au3(audi0);
    }
    }//GEN-LAST:event_REPRODUCIRActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        a1.setEnabled(true);a2.setEnabled(true);a3.setEnabled(true);a4.setEnabled(true);a5.setEnabled(true);a6.setEnabled(true);a7.setEnabled(true);a8.setEnabled(true);
        a9.setEnabled(true);a10.setEnabled(true);a11.setEnabled(true);a12.setEnabled(true);a13.setEnabled(true);a14.setEnabled(true);a15.setEnabled(true);a16.setEnabled(true);
        a17.setEnabled(true);a18.setEnabled(true);a19.setEnabled(true);a20.setEnabled(true);a21.setEnabled(true);a22.setEnabled(true);a23.setEnabled(true);a24.setEnabled(true);
        a25.setEnabled(true);a26.setEnabled(true);a27.setEnabled(true);a28.setEnabled(true);a29.setEnabled(true);a30.setEnabled(true);a31.setEnabled(true);a32.setEnabled(true);
        a33.setEnabled(true);a34.setEnabled(true);a35.setEnabled(true);a36.setEnabled(true);

        //REINICIAR TODOS LOS CONTADORES Y TEXTOS EN PANTALLA
        asignarImagen();
        mostrarcara = 0;
        Puntaje.setText("0");
        movimientos.setText("0");
        turn = 0;
        puntaje = 0;
        Ganador = false; 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntajeActionPerformed

    }//GEN-LAST:event_PuntajeActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CANCIONES;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JTextField Puntaje;
    private javax.swing.JButton REPRODUCIR;
    private javax.swing.JLabel Turno;
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a13;
    private javax.swing.JButton a14;
    private javax.swing.JButton a15;
    private javax.swing.JButton a16;
    private javax.swing.JButton a17;
    private javax.swing.JButton a18;
    private javax.swing.JButton a19;
    private javax.swing.JButton a2;
    private javax.swing.JButton a20;
    private javax.swing.JButton a21;
    private javax.swing.JButton a22;
    private javax.swing.JButton a23;
    private javax.swing.JButton a24;
    private javax.swing.JButton a25;
    private javax.swing.JButton a26;
    private javax.swing.JButton a27;
    private javax.swing.JButton a28;
    private javax.swing.JButton a29;
    private javax.swing.JButton a3;
    private javax.swing.JButton a30;
    private javax.swing.JButton a31;
    private javax.swing.JButton a32;
    private javax.swing.JButton a33;
    private javax.swing.JButton a34;
    private javax.swing.JButton a35;
    private javax.swing.JButton a36;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField movimientos;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel xd;
    private javax.swing.JLabel xd1;
    // End of variables declaration//GEN-END:variables
}
