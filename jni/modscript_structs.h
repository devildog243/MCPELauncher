#ifdef __cplusplus
#define cppstr std::string
#else
typedef void cppstr;
#endif

#ifdef __cplusplus
extern "C" {
#endif
typedef struct {
	void** vtable; //0
	char filler[13];
	cppbool isRemote;
} Level;
typedef struct {
	void** vtable; //0
	float x; //4
	float y; //8
	float z; //12
	char filler[12];//16
	int entityId; //28
	char filler2[20];//32
	float motionX; //52
	float motionY; //56
	float motionZ; //60
	float yaw; //64
	float pitch; //68
	float prevYaw; //72
	float prevPitch; //76
} Entity;
typedef Entity Player;

typedef struct {
	void** vtable; //0
	int itemId; //4
	int idunno; //8
	int icon; //12
	int idunno2; //16
	int idunno3; //20
	int idunno4; //24
	int idunno5; //28
	cppstr* description; //31
} Item;

typedef struct {
	int count; //0
	int damage; //4
	Item* item;//8
	void* block; //12
	cppbool wtf; //16
	cppbool wtf2; //17
	cppbool wtf3; //18
	cppbool wtf4; //19
} ItemInstance;
#ifdef __cplusplus
}
#endif
