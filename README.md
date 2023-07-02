
# Pizzeria Solar

proyecto

## API Reference

#### Get all Pizza

```http
  GET /pizza/
```

#### Order of Pizza

```http
  POST /pizza/
```

| Parameter | Type     | Description                                    |
| :-------- | :------- |:-----------------------------------------------|
| `fecha`      | `string` | **Required**. fecha de pedido mm/dd/yyyy       |
| `opcionPizza`| `int`    | **Required**. opcion de las pizzas disponibles |
| `pizza`      | `Object` | es requerido cuando la opcion es 0             |

#### Object Pizza

| Parameter   | Type     | 
| :--------   | :------- | 
| `nombre`    | `string` |
| `queso`     | `boolean`|
| `pollo`     | `boolean`|
| `pinia`     | `boolean`|
| `carne`     | `boolean`|
| `cebolla`   | `boolean`|
| `tomate`    | `boolean`|
| `papas`     | `boolean`|
| `champinio` | `boolean`|
| `mortadela` | `boolean`|

