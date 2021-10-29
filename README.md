# TallerSOLID-G4


## 1) Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.

      En este punto se está violando el principio de responsabilidad única. El motivo de este imcumplimiento se da porque ambas clases 
      al manejar el calculo de precios tenian 2 responsabilidades.


## 2) Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.

      El segundo punto la clase OperacionesAderezo utiliza metodos de agregar y eliminar aderezos para cada una de las subclases de la clase padre. Por lo que 
      se decidio eliminar esta clase y agregar esos metodos directamente a la clase padre Postre.

## 3) Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados, deben estar en otra clase por si cambia la fórmula de cálculo. La clase nueva debe llamarse Procesos.ManejadorDePrecio.

      Se esta violando el principio 1( Single responsibility principle) debido a que la clase Helado y Pastel tienen más de una 
      responsabilidad, donde implica que el cambio en una responsabilidad provocará la modificación en otra. Por lo que debemos separar
      las responsabilidades de la clase, y crear  una clase que se encargue de los métodos calcularPrecioFinal() y  showPrecioFinal(),  
      así ante algun posible cambio en la forma de calcular el precio se puede modificar unicamente el metodo calcularPrecioFinal de la clase
      creada.


## 4) Enum Adicionales. Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre y un método abstracto setNombre para que cada tipo de aderezo sea una subclase 
##    de Aderezo e implemente dicho método. También, sobrescriba el método toString() en la clase Aderezo, para que devuelva el nombre del aderezo en mayúsculas.


      Se está violando el Principio de Inversión de Dependencias al depender de abstracciones las clases aprovechan la interfaz 
      de las abstracciones, convertimos la clase Aderezo en abstracta y  convertimos cada tipo de aderezo sea una subclase de aderezo.


## 5) Paquete Leche y la clase Procesos.ManejadorDeLeche. En el main descomente las instrucciones para realizar el cambio del tipo de leche 
##    utilizada en cada postre, luego analice como solucionar el error generado en la clase Leche.LecheDeslactosada.
 

      Se está violando el Principio de Sustitución de Liskov dado que no se es posible sustituir una clase derivada (LecheDeslactosada)
      por su clase padre (LecheEntera) ya que constantemente se está lanzando una advertencia al intentar usar esta clase derivada con 
      un pastel.
      Para solucionar este problema se creó un sólo metodo abstracto en la clase LecheEntera denominador usar(), este metodo es
      implementado por las clases derivadas (LecheDeslactosada y LecheDescremada) recibiendo el Postre con el que se quiere usar el
      tipo de leche en cuestión. En la clase Postre se creó un metodo abstracto cambiarLeche(), este sera implementado por todos los postres
      y cada uno se encargara de restringir el tipo de leche que permite usar.

