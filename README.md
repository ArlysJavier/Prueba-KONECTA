# Prueba-KONECTA
desarollo pueba cafeteria 

el desarrollo de este proyecto fuen el el ID NetBeans ID 16
la base de dato se trabajo en MySQL con phpMyAdmin utilizando el panel de control XAMPP
en el repo se encuentra tanto los codigos, librerias y base de datos en instrucciones SQl para su prueba.

se debe importar todo el folder del repo "Prueba-KONECTA" al ID

luego de abrir el folder en el ID encontraras una ruta como se ve en la imgen:

![image](https://user-images.githubusercontent.com/114090836/220136043-0c3b5d8f-7181-4884-95ce-1ba29c894ab0.png)

en ella se encuentrar todas las ventanas que conforman el front del proyecto con sus respectivos codigos y librerias para la conexion a las bases de datos y los gestores de dependecias.

ejecutamos la ventana con el nombre: "ventana_inicio.java" como se ve en la imagen
![image](https://user-images.githubusercontent.com/114090836/220137140-95b61484-8f20-4b16-8bea-8fae797f1e56.png)

le damos run y debe abrir la interface principal:
![image](https://user-images.githubusercontent.com/114090836/220137346-77cd9bf5-0cef-4c0d-afc1-435d7dcd427b.png)

damos en ingresar y se depliega el menu de incio donde se encuentran todas la opciones que se solicitaron para la gestion de informacion del proyecto cafeteria
![image](https://user-images.githubusercontent.com/114090836/220137576-cc04ec2c-37ac-4424-a40e-af7a8289f920.png)

alli podemos realizar cada una de las funciones solicitadas
para crear un producto en la base de datos damos click en el boton crear producto y vemos la siguiente interface
![image](https://user-images.githubusercontent.com/114090836/220137901-9f855014-8d54-46fa-9164-4578e77832dc.png)

Registramos cada uno de los datos solicitados, si algunos de los campos no son llenados el programa te mandara un msm en pantalla y una ilustracion en color donde debes llenar los datos para poder crear el registro del producto en la base de datos asi:
![image](https://user-images.githubusercontent.com/114090836/220138576-b71ecf83-92d6-4740-bc04-45cbdfc50b49.png)

llenamos todos los campo y damos cli en registrar.
![image](https://user-images.githubusercontent.com/114090836/220138898-3babcfb1-4b58-4b11-81a1-a4c81498c583.png)

vemos el msm de registro
![image](https://user-images.githubusercontent.com/114090836/220139216-0c6e3843-d6b9-4ff9-9578-5804e1acaf1a.png)

y ahora podemos observar el producto en la base de datos de MySQL: hay que actualizar en el localhost para visualizar el cambio.
![image](https://user-images.githubusercontent.com/114090836/220140145-c85f83b9-76b9-4299-bb28-0b363e4cf866.png)


tambien podemos ver esto en el menu de lista BD del programa 
![image](https://user-images.githubusercontent.com/114090836/220139847-17f8d1b2-9df5-4540-8d9c-cfd139575b3e.png)

aqui
![image](https://user-images.githubusercontent.com/114090836/220139991-63b3312e-a4de-4ff2-885e-13f5d77d6825.png)

en la opcion modificar producto encontramos la siguiente interface
![image](https://user-images.githubusercontent.com/114090836/220140395-c0eb2fb7-2139-40b2-8003-4072f0013194.png)

para modificar un producto debemos buscarlo escribiento su N° de refrencias estos numeros lo puedes ver en la lista de la base de datos que abristes anteriormente.

![image](https://user-images.githubusercontent.com/114090836/220140700-331734c8-43a5-4ffe-864c-6bb5b886cbdb.png)

podemos modificar la casilla que quieras y luego pones la fecha en que hicistes el cambio y das clic en modificar para ejecutar los cambios en la BD

![image](https://user-images.githubusercontent.com/114090836/220141743-f6bfeeff-b5ef-465f-b7c7-ae7088a27c60.png)

luego que se registra el cambio puedes observarlo en la BD asi como en los pasos anterior o tambien en la lista de productos desplegadas en el programa que vienen directamente de la BD

asi mismo tienes la opcion de eliminar datos, se realiza el mismo proceso que en las otras interface, haces un breve llamado del producto por la referencia y si desea borrarlo ejectutas la funcion en el boton Borrar

![image](https://user-images.githubusercontent.com/114090836/220142267-4e9900a8-09db-46d0-991f-1be373933e28.png)

![image](https://user-images.githubusercontent.com/114090836/220142384-c10d36e0-ad0a-481f-9a0d-40a9b348d929.png)

en la opcion vender puedes ejecutar transaciones de los productos, hace un llamodo del producto a vender del cual el programa te dara una breve vision del producto, agregas la cantidad a vender y este te dira si es posible de acuerdo al stock, de ser posible se descontara la cantidad vendida y se actualizara en la base de datos, tabien se crea un registro en el programa de la venta el cual pedes ver en la opcion "registro de venta" esta informacion tambien esta almacenada en otra tabla en la base de datos bd_productos

![image](https://user-images.githubusercontent.com/114090836/220143061-2cfb3fef-b453-47a9-ad09-196a13616e7d.png)

![image](https://user-images.githubusercontent.com/114090836/220143318-1896320b-8524-4d51-8baf-a0e4e802ff48.png)

vendemos

![image](https://user-images.githubusercontent.com/114090836/220143399-5b02a110-9944-4292-b232-37de3b8a7f4b.png)
se actuliza la informacion
![image](https://user-images.githubusercontent.com/114090836/220143509-dadcaa1f-f189-40eb-bb61-08ad491dc231.png)

y ya puedes ver los cambios en el registro de ventas
![image](https://user-images.githubusercontent.com/114090836/220143796-4486796a-6575-4a4c-80bc-5d79bbde69ac.png)

![image](https://user-images.githubusercontent.com/114090836/220143954-c95a6104-42e1-4999-81b1-64d6dc24d584.png)

registro de ventas lo depliegas en el menu de inicio opcion registro ventas

![image](https://user-images.githubusercontent.com/114090836/220144073-8ae6a32c-31a2-47ae-8eca-e78f40746b28.png)

por ultimo tenemos la opcion de realizar consulta de los productos mas vendidos y el de mayor stock en el momento dando clic en la opcion del menu iniciar
"consuta a BD" en este caso tenemos los siguientes productos:

![image](https://user-images.githubusercontent.com/114090836/220144521-1a5f3303-7078-4310-bd15-57d068ca1492.png)

de este modo puedes navegar por las diferentes opciones del programa para la la gestion en la cafeteria.

slds


























