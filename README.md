# Conversor-java

Conversor de monedas

Este proyecto responde a el primer challenge de backend de alura para el programa Oracle One

El programa consiste y se basa en mayor parte en el uso de java swing a travez de las instrucciones JOptionpane
dispone un primer menu que ofrece la seleccion entre la conversion de divisas y la de temperatura que se muestran usando showinputdialog
al seleccionar una de las opciones se almacenan en un objeto del mismo nombre este se compara usando if ya que me resulto mas practico para los strings
ya que cabe mencionar el valor que reciben showinputdialog es un tipo string dependiendo de eso muestra un mensaje de que se selecciono
y a travez del uso de this en la variable privada seleccion se almacena la cadena y luego salta a los metodos divisas o temp
que despliegan otro menu que muestra las opciones para convertir y dependiendo de la seleccionada se almacena el string en dos variables una para la opcion elegida en divisas
y otra para la opcion elegida en temperatura dependiendo de esto se ejecutaran los metodos de conversion o conversionT que se encargan de el ingreso de los datos y de la conversion valga la redundancia
estos metodos a travez de showinputdialog se almacenan en un string llamado numero para las divisas y temp para las temperaturas. luego se realiza una evaluacion para saber si el valor ingresado corresponde a un numero de lo contrario notificara que no es valido el valor y tambien notificara que se debe ingresar un valor valido
en caso de ser un valor valido comprendiendo que sea numero toma el string y lo parsea para que se convierta en una variable tipo double representado como numeroparseado o tempparseado dependiendo del caso
con esto hecho entra un switch case con un caso para cada opcion de moneda y temperatura que a travez de las variables privadas declaradas al principio del codigo realiza las conversiones cabe destacar que en mi pais Chile el valor minimo de nuestra moneda es 1 peso lo cual facilita la conversion pero esto deriva en el problema que no es recomendable redondear en ningun caso de los conversores puesto que la precision del mismo disminuye demasiado.


Solo yo poseo acceso al proyecto ya que todavia no entiendo muy bien como funciona git y tampoco conozco a nadie con quien colaborar lamentablemente debido a que no he tenido el tiempo para hacer el networking
que deberia de tener si alguien lee este readme sigame y lo sigo devuelta.

El proyecto fue hecho 100% con java usando el IDE de eclipse ya que al ver el challenge me fije en que la mayoria de los videos conocen cosas mas avanzadas que yo y hacerlo asi me hace sentir que soy honesto conmigo mismo de lo que se por lo que lo hice de la manera mas basica posible para mi y tambien eficiente ya que mi objetivo era que fuera un programa en bruto y que pudiese servir como una base facil de entender para alguien como yo que es lo que no encontre en los videos que busque.

El proyecto en su totalidad es de autoria mia y fue realizado en el plazo de 18 horas dividas en 3 dias
