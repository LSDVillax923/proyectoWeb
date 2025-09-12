package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.ComidaRepository;
import com.example.demo.repository.DetallePedidoRepository;
import com.example.demo.repository.PedidoRepository;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner {

        @Autowired
        ComidaRepository comidaRepository;

        @Autowired
        PedidoRepository pedidoRepository;

        @Autowired
        ClienteRepository clienteRepository;

        @Autowired
        DetallePedidoRepository detallePedidoRepository;

        @Override
        public void run(ApplicationArguments args) throws Exception {
                comidaRepository.save(new Comida(
                                "Hamburguesa Gourmet",
                                "Jugosa carne de res, queso maduro, cebolla caramelizada y pan artesanal.",
                                38000, "/images/platos/hamburguesa.png"));

                comidaRepository.save(new Comida(
                                "Salchipapa Especial",
                                "Papas fritas artesanales con salchicha  y salsas de la casa.",
                                28000, "/images/platos/salchiPapa.png"));

                comidaRepository.save(new Comida(
                                "Carne Asada",
                                "Corte de res a la parrilla acompañado de vegetales salteados.",
                                45000, "/images/platos/carneAsada.png"));

                comidaRepository.save(new Comida(
                                "Pollo Asado",
                                "Pechuga de pollo marinada y asada lentamente con hierbas frescas.",
                                32000, "/images/platos/pechugaAsada.png"));

                comidaRepository.save(new Comida(
                                "Ceviche",
                                "Pescado fresco marinado en jugo de limón con cebolla y cilantro",
                                45000, "/images/platos/ceviche.png"));

                comidaRepository.save(new Comida(
                                "Pasta Alfredo",
                                "Pasta fresca con salsa Alfredo cremosa y queso parmesano.",
                                38000, "/images/platos/pasta.png"));

                comidaRepository.save(new Comida(
                                "Pizza Gourmet",
                                "Masa artesanal, salsa de tomate fresco y ingredientes seleccionados.",
                                40000, "/images/platos/pizza.png"));

                comidaRepository.save(new Comida(
                                "Arepa Rellena",
                                "Arepa de maíz rellena de queso y carne mechada.",
                                18000, "/images/platos/arepaRellena.jpeg"));

                comidaRepository.save(new Comida(
                                "Ensalada César",
                                "Lechuga fresca con pollo a la plancha, crotones y aderezo César.",
                                25000, "/images/platos/ensaladaCesar.jpeg"));

                comidaRepository.save(new Comida(
                                "Sancocho de Pollo",
                                "Sopa tradicional con pollo, yuca, plátano y mazorca.",
                                28000, "/images/platos/sancocho.jpeg"));

                comidaRepository.save(new Comida(
                                "Bandeja Paisa",
                                "Plato típico con fríjoles, arroz, carne molida, huevo frito, chicharrón y aguacate.",
                                42000, "/images/platos/bandejaPaisa.jpeg"));

                comidaRepository.save(new Comida(
                                "Ajiaco Santafereño",
                                "Sopa espesa de pollo, papa criolla y mazorca con guascas.",
                                35000, "/images/platos/ajiaco.jpeg"));

                comidaRepository.save(new Comida(
                                "Lomo de Cerdo BBQ",
                                "Lomo de cerdo bañado en salsa BBQ acompañado de papas al horno.",
                                39000, "/images/platos/lomo.jpeg"));

                comidaRepository.save(new Comida(
                                "Tacos Mexicanos",
                                "Tortillas de maíz rellenas con carne al pastor, piña y cilantro.",
                                30000, "/images/platos/tacos.jpeg"));


                comidaRepository.save(new Comida(
                                "Sushi Variado",
                                "Combinación de rolls de salmón, atún y vegetales.",
                                42000, "/images/platos/sushi.jpeg"));

                comidaRepository.save(new Comida(
                                "Arroz con Mariscos",
                                "Arroz salteado con camarones, calamares y mejillones.",
                                46000, "/images/platos/arroz.jpeg"));

                comidaRepository.save(new Comida(
                                "Costillas BBQ",
                                "Costillas de cerdo glaseadas con salsa barbacoa.",
                                48000, "/images/platos/costillas.jpeg"));

                comidaRepository.save(new Comida(
                                "Churrasco Argentino",
                                "Corte de carne asada acompañado de chimichurri y papas fritas.",
                                50000, "/images/platos/churrazcoArgentino.jpeg"));

                comidaRepository.save(new Comida(
                                "Falafel con Hummus",
                                "Croquetas de garbanzo con crema de garbanzos y pan pita.",
                                28000, "/images/platos/falafel.jpeg"));

                comidaRepository.save(new Comida(
                                "Wrap de Pollo",
                                "Tortilla de harina con pollo, lechuga, tomate y mayonesa.",
                                24000, "/images/platos/wrapPollo.jpeg"));

                comidaRepository.save(new Comida(
                                "Cazuela de Mariscos",
                                "Cazuela cremosa con camarones, pescado y almejas.",
                                47000, "/images/platos/cazuelaMariscos.jpeg"));

                comidaRepository.save(new Comida(
                                "Paella Valenciana",
                                "Arroz con pollo, conejo, verduras y azafrán.",
                                49000, "/images/platos/paella.jpeg"));


                comidaRepository.save(new Comida(
                                "Shawarma",
                                "Carne de cordero marinada servida en pan pita con salsa tahini.",
                                31000, "/images/platos/shawarma.jpeg"));

                comidaRepository.save(new Comida(
                                "Pad Thai",
                                "Fideos de arroz salteados con camarones, huevo y maní.",
                                35000, "/images/platos/padThai.jpeg"));

                comidaRepository.save(new Comida(
                                "Arroz Chaufa",
                                "Arroz frito estilo peruano con pollo, huevo y cebollín.",
                                30000, "/images/platos/arrozChaufa.jpeg"));

                comidaRepository.save(new Comida(
                                "Milanesa Napolitana",
                                "Filete empanizado con salsa de tomate, jamón y queso.",
                                34000, "/images/platos/milanesaNapolitana.jpeg"));

                comidaRepository.save(new Comida(
                                "Ensalada Mediterránea",
                                "Tomates, pepino, aceitunas, queso feta y aceite de oliva.",
                                26000, "/images/platos/ensaladaMediterranea.jpeg"));

                comidaRepository.save(new Comida(
                                "Crepes de Pollo y Champiñones",
                                "Crepes rellenos con pollo y champiñones en salsa bechamel.",
                                33000, "/images/platos/crepes.jpeg"));

                comidaRepository.save(new Comida(
                                "Empanadas Colombianas",
                                "Empanadas de carne con papa acompañadas de ají casero.",
                                15000, "/images/platos/empanada.jpeg"));

                comidaRepository.save(new Comida(
                                "Arequipe con Queso",
                                "Postre típico de arequipe acompañado de trozos de queso fresco.",
                                12000, "/images/platos/arequipeQueso.jpeg"));

                comidaRepository.save(new Comida(
                                "Brownie con Helado",
                                "Brownie de chocolate caliente acompañado de helado de vainilla.",
                                18000, "/images/platos/brownie.jpeg"));

                comidaRepository.save(new Comida(
                                "Cheesecake de Fresa",
                                "Pastel cremoso con base de galleta y salsa de fresas.",
                                19000, "/images/platos/cheesecake.jpeg"));

                comidaRepository.save(new Comida(
                                "Helado Artesanal",
                                "Helados de frutas naturales en diferentes sabores.",
                                14000, "/images/platos/helado.jpeg"));

                comidaRepository.save(new Comida(
                                "Tiramisú",
                                "Postre italiano con café, cacao y mascarpone.",
                                20000, "/images/platos/tiramisu.jpeg"));

                comidaRepository.save(new Comida(
                                "Jugo Natural de Mango",
                                "Jugo fresco de mango sin azúcar añadida.",
                                8000, "/images/platos/jugoMango.jpeg"));

                comidaRepository.save(new Comida(
                                "Jugo Natural de Piña",
                                "Jugo fresco de piña sin azúcar añadida.",
                                8000, "/images/platos/jugoPina.jpeg"));

                comidaRepository.save(new Comida(
                                "Jugo Natural de Maracuya",
                                "Jugo fresco de maracuyá sin azúcar añadida.",
                                8000, "/images/platos/jugoMaracuya.jpeg"));

                comidaRepository.save(new Comida(
                                "Jugo Natural de Fresa",
                                "Jugo fresco de fresa sin azúcar añadida.",
                                8000, "/images/platos/jugoFresa.jpeg"));

                comidaRepository.save(new Comida(
                                "Jugo Natural de Lulo",
                                "Jugo fresco de lulo sin azúcar añadida.",
                                8000, "/images/platos/jugoLulo.jpeg"));

                comidaRepository.save(new Comida(
                                "Limonada de Coco",
                                "Bebida refrescante a base de coco y limón.",
                                10000, "/images/platos/limonadaCoco.jpeg"));

                comidaRepository.save(new Comida(
                                "Limonada Cerezada",
                                "Bebida refrescante a base de cereza y limón.",
                                10000, "/images/platos/limonadaCereza.jpeg"));

                comidaRepository.save(new Comida(
                                "Limonada Natural",
                                "Bebida refrescante a base de limón y hierbabuena.",
                                10000, "/images/platos/limonadaNatural.jpeg"));

                comidaRepository.save(new Comida(
                                "Mojito sin Alcohol",
                                "Cóctel refrescante con hierbabuena, limón y soda.",
                                12000, "/images/platos/mojito.jpeg"));

                comidaRepository.save(new Comida(
                                "Té Helado",
                                "Té negro frío con limón y hielo.",
                                9000, "/images/platos/te.jpeg"));


                // --- Crear clientes ---
                Cliente cliente1 = clienteRepository.save(new Cliente("Diego Andres", "Villabon Correa", "diego.villabon@gmail.com", "1234", "3101234567", "Calle 123 #45-67"));
                Cliente cliente2 = clienteRepository.save(new Cliente("Maria Gomez", "Martinez", "maria.gomez@gmail.com", "5678", "3107654321", "Calle 234 #56-78"));
                Cliente cliente3 = clienteRepository.save(new Cliente("Carlos Sanchez", "Hernandez", "carlos.sanchez@gmail.com", "9101", "3109876543", "Calle 345 #67-89"));
                Cliente cliente4 = clienteRepository.save(new Cliente("Laura Torres", "Ramirez", "laura.torres@gmail.com", "1121", "3101234567", "Calle 456 #78-90"));
                Cliente cliente5 = clienteRepository.save(new Cliente("Luis Rodriguez", "Diaz", "luis.rodriguez@gmail.com", "3141", "3107654321", "Calle 567 #89-01"));

                Comida comida1 = comidaRepository.findById(1L).get();
                Comida comida2 = comidaRepository.findById(2L).get();
                Comida comida3 = comidaRepository.findById(3L).get();
                Comida comida4 = comidaRepository.findById(4L).get();
                Comida comida5 = comidaRepository.findById(5L).get();
                Comida comida6 = comidaRepository.findById(6L).get();
                Comida comida7 = comidaRepository.findById(7L).get();
                Comida comida8 = comidaRepository.findById(8L).get();

                // --- Crear pedidos y sus detalles ---
                
                // Pedido 1
                Pedido pedido1 = new Pedido("Preparandose");
                pedido1.setCliente(cliente1);
                pedidoRepository.save(pedido1); // Guarda el pedido primero para que tenga un ID
                
                DetallePedido detalle1_1 = new DetallePedido(2); // 2 hamburguesas
                detalle1_1.setPedido(pedido1);
                detalle1_1.setComida(comida1);
                detallePedidoRepository.save(detalle1_1);

                DetallePedido detalle1_2 = new DetallePedido(1); // 1 salchipapa
                detalle1_2.setPedido(pedido1);
                detalle1_2.setComida(comida2);
                detallePedidoRepository.save(detalle1_2);


                // Pedido 2
                Pedido pedido2 = new Pedido("Despachado");
                pedido2.setCliente(cliente2);
                pedidoRepository.save(pedido2);

                DetallePedido detalle2_1 = new DetallePedido(3); // 3 de comida 3
                detalle2_1.setPedido(pedido2);
                detalle2_1.setComida(comida3);
                detallePedidoRepository.save(detalle2_1);

                DetallePedido detalle2_2 = new DetallePedido(1); // 1 de comida 4
                detalle2_2.setPedido(pedido2);
                detalle2_2.setComida(comida4);
                detallePedidoRepository.save(detalle2_2);
                
                // Pedido 3
                Pedido pedido3 = new Pedido("Entregado");
                pedido3.setCliente(cliente3);
                pedidoRepository.save(pedido3);

                DetallePedido detalle3_1 = new DetallePedido(1); // 1 de comida 5
                detalle3_1.setPedido(pedido3);
                detalle3_1.setComida(comida5);
                detallePedidoRepository.save(detalle3_1);


                // Pedido 4
                Pedido pedido4 = new Pedido("Cancelado");
                pedido4.setCliente(cliente4);
                pedidoRepository.save(pedido4);
                
                DetallePedido detalle4_1 = new DetallePedido(2); // 2 de comida 6
                detalle4_1.setPedido(pedido4);
                detalle4_1.setComida(comida6);
                detallePedidoRepository.save(detalle4_1);
                
                DetallePedido detalle4_2 = new DetallePedido(1); // 1 de comida 7
                detalle4_2.setPedido(pedido4);
                detalle4_2.setComida(comida7);
                detallePedidoRepository.save(detalle4_2);
                

                // Pedido 5
                Pedido pedido5 = new Pedido("Preparandose");
                pedido5.setCliente(cliente5);
                pedidoRepository.save(pedido5);
                
                DetallePedido detalle5_1 = new DetallePedido(1); // 1 de comida 8
                detalle5_1.setPedido(pedido5);
                detalle5_1.setComida(comida8);
                detallePedidoRepository.save(detalle5_1);
                
                DetallePedido detalle5_2 = new DetallePedido(3); // 3 de comida 1
                detalle5_2.setPedido(pedido5);
                detalle5_2.setComida(comida1);
                detallePedidoRepository.save(detalle5_2);

        }

}
