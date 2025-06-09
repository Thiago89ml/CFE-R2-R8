Explicación pasos LOL:

El programa simula una batalla por equipos entre campeones con distintas especializaciones,hay 2 equipos contando con tres campeones cada uno, los personajes pueden tener diferentes roles como: TopLaner,MidLaner,ADC, Support y Jungla.

Los campeones se enfrentan por turnos,por medio del combate random s elige quien ataca y quien defiende. El combate continúa hasta que todos los miembros de unos de los equipo sea derrotado.

Las clases y sus atributos:

Cada campeón posee nombre,rol,ataque,defensa,velocidad y salud.

Los distintos campeones en su subclase modifican algún que otro método que posee la clase principal junto a tener un atributo especial identificatorio de cada Personaje.

Ejemplo:

ADC tiene un atributo llamado “rango”,generando que a su ataque básico se le suma una parte del rango.

Lógica de funcionamiento:

Se crean dos equipos(equipo 1 y equipo2) con 3 campeones en cada equipo,imprimiendo con estadísticas de cada campeón.

Mientras al menos un integrante de los equipos tenga una salud mayor a 0, se seleccionan aleatoriamente un atacante y un defensor de cada equipo,luego se decide al azar si el atacante usa un ataque básico o especial, el daño se aplica al defensor, y se actualiza su salud,mostrandose en consola el daño recibido y la barra de vida del defensor,por ultimo se anuncia el equipo ganador.

Métodos auxiliares: -equipoSigueVivo(Campeon[] equipo): retorna “true” si al menos un campeón del equipo tiene una salud que se mayor a 0.

-obtenerVivoAleatorio(Campeon[] equipo,Random rand): Selecciona aleatoriamente un campeón del equipo que aún está con vida.

-barraDeVida(). genera una forma gráfica de la barra de salud del campeón.

Posibles implementaciones futuras Implementar un sistema de rondas junto a un contador con puntuación por derribar a un campeón. Agregar efectos de buff o debuff. Creación de una interfaz gráfica.
