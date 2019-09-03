gremlin> :remote config alias g test_new.g
==>g=test_new.g
gremlin> schema.describe()
==>schema.propertyKey("sensor_id").Uuid().single().create()
schema.propertyKey("fridgeItem").Text().single().create()
schema.propertyKey("name").Text().single().create()
schema.propertyKey("location").Point().single().create()
schema.propertyKey("timestamp").Text().single().create()
schema.propertyKey("city_id").Text().single().create()
schema.edgeLabel("linked").multiple().properties("city_id", "sensor_id", "name").create()
schema.vertexLabel("ingredient").properties("name").create()
schema.vertexLabel("ingredient").index("byname").materialized().by("name").add()
schema.vertexLabel("FridgeSensor").partitionKey("city_id").clusteringKey("sensor_id").properties("fridgeItem", "location").create()
schema.vertexLabel("time").properties("name", "timestamp").create()
schema.edgeLabel("linked").connection("ingredient", "FridgeSensor").add()
gremlin> g.V()
==>v[{~label=FridgeSensor, city_id=davis, sensor_id=9c23b683-1de2-4c97-a26a-277b3733732a}]
==>v[{~label=FridgeSensor, city_id=davis, sensor_id=ad7a68bc-31b4-4a2d-a109-9867eae3cce3}]
==>v[{~label=FridgeSensor, city_id=santaCruz, sensor_id=87d9bec0-e847-4dda-a282-016869ad2dc2}]
==>v[{~label=FridgeSensor, city_id=santaCruz, sensor_id=93c4ec9b-68ff-455e-8668-1056ebc3689f}]
==>v[{~label=FridgeSensor, city_id=santaCruz, sensor_id=b6c20c89-06d5-4f3c-9424-030c35a00dff}]
==>v[{~label=FridgeSensor, city_id=sacramento, sensor_id=9c23b683-1de2-4c97-a26a-277b3733732a}]
==>v[{~label=FridgeSensor, city_id=sacramento, sensor_id=eff4a8af-2b0d-4ba9-a063-c170130e2d84}]
==>v[{~label=ingredient, community_id=1574432000, member_id=0}]
==>v[{~label=ingredient, community_id=1574432000, member_id=1}]
==>v[{~label=ingredient, community_id=1574432000, member_id=2}]
==>v[{~label=ingredient, community_id=314824576, member_id=0}]
==>v[{~label=ingredient, community_id=314824576, member_id=1}]
==>v[{~label=ingredient, community_id=314824576, member_id=2}]
==>v[{~label=ingredient, community_id=1602541184, member_id=0}]
==>v[{~label=ingredient, community_id=1602541184, member_id=1}]
==>v[{~label=ingredient, community_id=1602541184, member_id=2}]
==>v[{~label=ingredient, community_id=1863325696, member_id=0}]
==>v[{~label=ingredient, community_id=1863325696, member_id=1}]
==>v[{~label=ingredient, community_id=1863325696, member_id=2}]
==>v[{~label=ingredient, community_id=1863325696, member_id=3}]
==>v[{~label=ingredient, community_id=1863325696, member_id=4}]
==>v[{~label=ingredient, community_id=1863325696, member_id=5}]
==>v[{~label=ingredient, community_id=1863325696, member_id=6}]
==>v[{~label=ingredient, community_id=1863325696, member_id=7}]
==>v[{~label=ingredient, community_id=1863325696, member_id=8}]
==>v[{~label=ingredient, community_id=1863325696, member_id=9}]
==>v[{~label=ingredient, community_id=1863325696, member_id=10}]
==>v[{~label=ingredient, community_id=1863325696, member_id=11}]
==>v[{~label=ingredient, community_id=1863325696, member_id=12}]
==>v[{~label=ingredient, community_id=1863325696, member_id=13}]
==>v[{~label=ingredient, community_id=1863325696, member_id=14}]
==>v[{~label=ingredient, community_id=1863325696, member_id=15}]
==>v[{~label=ingredient, community_id=1863325696, member_id=16}]
==>v[{~label=ingredient, community_id=1863325696, member_id=17}]
==>v[{~label=ingredient, community_id=1863325696, member_id=18}]
==>v[{~label=ingredient, community_id=1863325696, member_id=19}]
==>v[{~label=ingredient, community_id=1863325696, member_id=20}]
==>v[{~label=ingredient, community_id=1863325696, member_id=21}]
==>v[{~label=ingredient, community_id=1863325696, member_id=22}]
==>v[{~label=ingredient, community_id=1863325696, member_id=23}]
==>v[{~label=ingredient, community_id=1863325696, member_id=24}]
==>v[{~label=ingredient, community_id=1863325696, member_id=25}]
==>v[{~label=ingredient, community_id=1863325696, member_id=26}]
==>v[{~label=ingredient, community_id=1863325696, member_id=27}]
==>v[{~label=ingredient, community_id=49903488, member_id=512}]
==>v[{~label=ingredient, community_id=49903488, member_id=513}]
==>v[{~label=ingredient, community_id=49903488, member_id=514}]
==>v[{~label=ingredient, community_id=790221824, member_id=0}]
==>v[{~label=ingredient, community_id=790221824, member_id=1}]
==>v[{~label=ingredient, community_id=790221824, member_id=2}]
==>v[{~label=ingredient, community_id=790221824, member_id=3}]
==>v[{~label=ingredient, community_id=790221824, member_id=4}]
==>v[{~label=ingredient, community_id=790221824, member_id=5}]
==>v[{~label=ingredient, community_id=790221824, member_id=6}]
==>v[{~label=ingredient, community_id=790221824, member_id=7}]
==>v[{~label=ingredient, community_id=790221824, member_id=8}]
==>v[{~label=ingredient, community_id=790221824, member_id=9}]
==>v[{~label=ingredient, community_id=790221824, member_id=10}]
==>v[{~label=ingredient, community_id=790221824, member_id=11}]
==>v[{~label=ingredient, community_id=790221824, member_id=12}]
==>v[{~label=ingredient, community_id=790221824, member_id=13}]
==>v[{~label=ingredient, community_id=790221824, member_id=14}]
==>v[{~label=ingredient, community_id=790221824, member_id=15}]
==>v[{~label=ingredient, community_id=790221824, member_id=16}]
==>v[{~label=ingredient, community_id=790221824, member_id=17}]
==>v[{~label=ingredient, community_id=790221824, member_id=18}]
==>v[{~label=ingredient, community_id=790221824, member_id=19}]
==>v[{~label=ingredient, community_id=790221824, member_id=20}]
==>v[{~label=ingredient, community_id=790221824, member_id=21}]
==>v[{~label=ingredient, community_id=790221824, member_id=22}]
==>v[{~label=ingredient, community_id=790221824, member_id=23}]
==>v[{~label=ingredient, community_id=790221824, member_id=24}]
==>v[{~label=ingredient, community_id=790221824, member_id=25}]
==>v[{~label=ingredient, community_id=790221824, member_id=26}]
==>v[{~label=ingredient, community_id=790221824, member_id=27}]
==>v[{~label=time, community_id=952309504, member_id=0}]
==>v[{~label=time, community_id=729390464, member_id=0}]
==>v[{~label=time, community_id=1259733632, member_id=0}]
==>v[{~label=time, community_id=1094452608, member_id=0}]