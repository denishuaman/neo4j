CREATE (AvengersEndgame:Pelicula {titulo:'Avengers: Endgame', direccion:'Anthony Russo, Joe Russo', anio: 2019})
CREATE (Dumbo:Pelicula {titulo:'Dumbo', direccion:'Justin Springer, Ehren Kruger, Derek Frey, Katterli Frauenfelder', anio: 2019})
CREATE (Juan:Usuario {nombre:'Juan Pérez', edad:30})
CREATE (Daniel:Usuario {nombre:'Daniel López', edad:20})
CREATE (Edgar:Usuario {nombre:'Edgar Gómez', edad:35})

CREATE
(AvengersEndgame)-[:CALIFICADO_POR {calificacion: 9, fecha:'2019-04-07'}]->(Juan),
(Dumbo)-[:CALIFICADO_POR {calificacion: 7, fecha:'2019-04-07'}]->(Daniel),
(AvengersEndgame)-[:CALIFICADO_POR {calificacion: 5, fecha:'2019-04-07'}]->(Edgar),
(Dumbo)-[:CALIFICADO_POR {calificacion: 10, fecha:'2019-04-07'}]->(Juan),
(AvengersEndgame)-[:CALIFICADO_POR {calificacion: 4, fecha:'2019-04-07'}]->(Daniel),
(Dumbo)-[:CALIFICADO_POR {calificacion: 6, fecha:'2019-04-07'}]->(Edgar);
