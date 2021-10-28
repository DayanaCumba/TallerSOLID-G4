# TallerSOLID-G4

### ---------- S - Single Responsibility Principle (SRP) ---------------------
#####  Para el primer punto se infirió que las clases Helado y Pastel no respetaban el principio de responsabilidad única, S - Single Responsibility Principle (SRP), el motivo de este imcumplimiento se da porque ambas clases permiten el acceso a sus propiedades, pero también,  cuentan con otros metodos como showPrecioFinal, calcularPrecioFinal, etc. Lo cual ocasiona que carguen con más de una responsabilidad, encontramos más factible ubicar dichos atributos y metodos en una clase padre, Postres.

### ---------- O – Open/Closed Principle (OCP) ---------------------
#### En el segundo punto se identifico que cada vez que se necesitara agregar un nuevo postre: helado, pudin, torta, etc. Se necesitaria agregar nuevos metodos en la clase OperacionesAderezo, por lo que no respetaria el principio abierto/cerrado, las entidades software (clases, módulos y funciones) deberían estar abiertos para su extensión, pero cerrados para su modificación. Para este punto se decidio eliminar la clase OperacionesAderezo, modificar y trasladar sus metodos a la clase Postres para que se pueda extender su comportamiento a otras clases y cerrada su modificación.

