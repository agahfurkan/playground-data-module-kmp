#import <Foundation/NSArray.h>
#import <Foundation/NSDictionary.h>
#import <Foundation/NSError.h>
#import <Foundation/NSObject.h>
#import <Foundation/NSSet.h>
#import <Foundation/NSString.h>
#import <Foundation/NSValue.h>

@class SharedKmpAnnouncement, SharedKmpCart, SharedKmpCategory, SharedKmpLoginResult, SharedKmpPdf, SharedKmpProduct, SharedKmpProductDetail, SharedKmpProductDetails, SharedKmpProductDetailsReview, SharedKmpProductDetailsSection, SharedKmpProductDetailsSectionDetail, SharedKmpRegisterResult, SharedKmpUser, SharedKotlinArray<T>, SharedKotlinException, SharedKotlinIllegalStateException, SharedKotlinRuntimeException, SharedKotlinThrowable, SharedKotlinTriple<__covariant A, __covariant B, __covariant C>, SharedStaticAnnouncementData, SharedStaticCartData, SharedStaticCategoryData, SharedStaticPdfData, SharedStaticProductData, SharedStaticUserData;

@protocol SharedKotlinIterator, SharedKotlinx_coroutines_coreFlow, SharedKotlinx_coroutines_coreFlowCollector;

NS_ASSUME_NONNULL_BEGIN
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wunknown-warning-option"
#pragma clang diagnostic ignored "-Wincompatible-property-type"
#pragma clang diagnostic ignored "-Wnullability"

#pragma push_macro("_Nullable_result")
#if !__has_feature(nullability_nullable_result)
#undef _Nullable_result
#define _Nullable_result _Nullable
#endif

__attribute__((swift_name("KotlinBase")))
@interface SharedBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end

@interface SharedBase (SharedBaseCopying) <NSCopying>
@end

__attribute__((swift_name("KotlinMutableSet")))
@interface SharedMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end

__attribute__((swift_name("KotlinMutableDictionary")))
@interface SharedMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end

@interface NSError (NSErrorSharedKotlinException)
@property (readonly) id _Nullable kotlinException;
@end

__attribute__((swift_name("KotlinNumber")))
@interface SharedNumber : NSNumber
- (instancetype)initWithChar:(char)value __attribute__((unavailable));
- (instancetype)initWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
- (instancetype)initWithShort:(short)value __attribute__((unavailable));
- (instancetype)initWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
- (instancetype)initWithInt:(int)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
- (instancetype)initWithLong:(long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
- (instancetype)initWithLongLong:(long long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
- (instancetype)initWithFloat:(float)value __attribute__((unavailable));
- (instancetype)initWithDouble:(double)value __attribute__((unavailable));
- (instancetype)initWithBool:(BOOL)value __attribute__((unavailable));
- (instancetype)initWithInteger:(NSInteger)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
+ (instancetype)numberWithChar:(char)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
+ (instancetype)numberWithShort:(short)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
+ (instancetype)numberWithInt:(int)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
+ (instancetype)numberWithLong:(long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
+ (instancetype)numberWithLongLong:(long long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
+ (instancetype)numberWithFloat:(float)value __attribute__((unavailable));
+ (instancetype)numberWithDouble:(double)value __attribute__((unavailable));
+ (instancetype)numberWithBool:(BOOL)value __attribute__((unavailable));
+ (instancetype)numberWithInteger:(NSInteger)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
@end

__attribute__((swift_name("KotlinByte")))
@interface SharedByte : SharedNumber
- (instancetype)initWithChar:(char)value;
+ (instancetype)numberWithChar:(char)value;
@end

__attribute__((swift_name("KotlinUByte")))
@interface SharedUByte : SharedNumber
- (instancetype)initWithUnsignedChar:(unsigned char)value;
+ (instancetype)numberWithUnsignedChar:(unsigned char)value;
@end

__attribute__((swift_name("KotlinShort")))
@interface SharedShort : SharedNumber
- (instancetype)initWithShort:(short)value;
+ (instancetype)numberWithShort:(short)value;
@end

__attribute__((swift_name("KotlinUShort")))
@interface SharedUShort : SharedNumber
- (instancetype)initWithUnsignedShort:(unsigned short)value;
+ (instancetype)numberWithUnsignedShort:(unsigned short)value;
@end

__attribute__((swift_name("KotlinInt")))
@interface SharedInt : SharedNumber
- (instancetype)initWithInt:(int)value;
+ (instancetype)numberWithInt:(int)value;
@end

__attribute__((swift_name("KotlinUInt")))
@interface SharedUInt : SharedNumber
- (instancetype)initWithUnsignedInt:(unsigned int)value;
+ (instancetype)numberWithUnsignedInt:(unsigned int)value;
@end

__attribute__((swift_name("KotlinLong")))
@interface SharedLong : SharedNumber
- (instancetype)initWithLongLong:(long long)value;
+ (instancetype)numberWithLongLong:(long long)value;
@end

__attribute__((swift_name("KotlinULong")))
@interface SharedULong : SharedNumber
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value;
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value;
@end

__attribute__((swift_name("KotlinFloat")))
@interface SharedFloat : SharedNumber
- (instancetype)initWithFloat:(float)value;
+ (instancetype)numberWithFloat:(float)value;
@end

__attribute__((swift_name("KotlinDouble")))
@interface SharedDouble : SharedNumber
- (instancetype)initWithDouble:(double)value;
+ (instancetype)numberWithDouble:(double)value;
@end

__attribute__((swift_name("KotlinBoolean")))
@interface SharedBoolean : SharedNumber
- (instancetype)initWithBool:(BOOL)value;
+ (instancetype)numberWithBool:(BOOL)value;
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpAnnouncement")))
@interface SharedKmpAnnouncement : SharedBase
- (instancetype)initWithId:(int64_t)id description:(NSString *)description title:(NSString *)title date:(NSString *)date priority:(NSString *)priority __attribute__((swift_name("init(id:description:title:date:priority:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpAnnouncement *)doCopyId:(int64_t)id description:(NSString *)description title:(NSString *)title date:(NSString *)date priority:(NSString *)priority __attribute__((swift_name("doCopy(id:description:title:date:priority:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *date __attribute__((swift_name("date")));
@property (readonly) NSString *description_ __attribute__((swift_name("description_")));
@property (readonly) int64_t id __attribute__((swift_name("id")));
@property (readonly) NSString *priority __attribute__((swift_name("priority")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpCart")))
@interface SharedKmpCart : SharedBase
- (instancetype)initWithCartId:(int64_t)cartId discount:(double)discount picture:(NSString *)picture price:(double)price productDescription:(NSString *)productDescription productId:(int64_t)productId productName:(NSString *)productName quantity:(int32_t)quantity __attribute__((swift_name("init(cartId:discount:picture:price:productDescription:productId:productName:quantity:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpCart *)doCopyCartId:(int64_t)cartId discount:(double)discount picture:(NSString *)picture price:(double)price productDescription:(NSString *)productDescription productId:(int64_t)productId productName:(NSString *)productName quantity:(int32_t)quantity __attribute__((swift_name("doCopy(cartId:discount:picture:price:productDescription:productId:productName:quantity:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int64_t cartId __attribute__((swift_name("cartId")));
@property (readonly) double discount __attribute__((swift_name("discount")));
@property (readonly) NSString *picture __attribute__((swift_name("picture")));
@property (readonly) double price __attribute__((swift_name("price")));
@property (readonly) NSString *productDescription __attribute__((swift_name("productDescription")));
@property (readonly) int64_t productId __attribute__((swift_name("productId")));
@property (readonly) NSString *productName __attribute__((swift_name("productName")));
@property (readonly) int32_t quantity __attribute__((swift_name("quantity")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpCategory")))
@interface SharedKmpCategory : SharedBase
- (instancetype)initWithCategoryId:(int64_t)categoryId categoryName:(NSString *)categoryName categoryIcon:(NSString *)categoryIcon __attribute__((swift_name("init(categoryId:categoryName:categoryIcon:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpCategory *)doCopyCategoryId:(int64_t)categoryId categoryName:(NSString *)categoryName categoryIcon:(NSString *)categoryIcon __attribute__((swift_name("doCopy(categoryId:categoryName:categoryIcon:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *categoryIcon __attribute__((swift_name("categoryIcon")));
@property (readonly) int64_t categoryId __attribute__((swift_name("categoryId")));
@property (readonly) NSString *categoryName __attribute__((swift_name("categoryName")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpLoginResult")))
@interface SharedKmpLoginResult : SharedBase
- (instancetype)initWithSuccess:(BOOL)success token:(NSString * _Nullable)token userId:(SharedLong * _Nullable)userId message:(NSString * _Nullable)message __attribute__((swift_name("init(success:token:userId:message:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpLoginResult *)doCopySuccess:(BOOL)success token:(NSString * _Nullable)token userId:(SharedLong * _Nullable)userId message:(NSString * _Nullable)message __attribute__((swift_name("doCopy(success:token:userId:message:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
@property (readonly) BOOL success __attribute__((swift_name("success")));
@property (readonly) NSString * _Nullable token __attribute__((swift_name("token")));
@property (readonly) SharedLong * _Nullable userId __attribute__((swift_name("userId")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpPdf")))
@interface SharedKmpPdf : SharedBase
- (instancetype)initWithPdfId:(int64_t)pdfId data:(NSString *)data title:(NSString *)title description:(NSString *)description fileSize:(NSString *)fileSize url:(NSString *)url __attribute__((swift_name("init(pdfId:data:title:description:fileSize:url:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpPdf *)doCopyPdfId:(int64_t)pdfId data:(NSString *)data title:(NSString *)title description:(NSString *)description fileSize:(NSString *)fileSize url:(NSString *)url __attribute__((swift_name("doCopy(pdfId:data:title:description:fileSize:url:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *data __attribute__((swift_name("data")));
@property (readonly) NSString *description_ __attribute__((swift_name("description_")));
@property (readonly) NSString *fileSize __attribute__((swift_name("fileSize")));
@property (readonly) int64_t pdfId __attribute__((swift_name("pdfId")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@property (readonly) NSString *url __attribute__((swift_name("url")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpProduct")))
@interface SharedKmpProduct : SharedBase
- (instancetype)initWithCategoryId:(int64_t)categoryId discount:(double)discount picture:(NSString *)picture price:(double)price productDescription:(NSString *)productDescription productId:(int64_t)productId productName:(NSString *)productName __attribute__((swift_name("init(categoryId:discount:picture:price:productDescription:productId:productName:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpProduct *)doCopyCategoryId:(int64_t)categoryId discount:(double)discount picture:(NSString *)picture price:(double)price productDescription:(NSString *)productDescription productId:(int64_t)productId productName:(NSString *)productName __attribute__((swift_name("doCopy(categoryId:discount:picture:price:productDescription:productId:productName:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int64_t categoryId __attribute__((swift_name("categoryId")));
@property (readonly) double discount __attribute__((swift_name("discount")));
@property (readonly) NSString *picture __attribute__((swift_name("picture")));
@property (readonly) double price __attribute__((swift_name("price")));
@property (readonly) NSString *productDescription __attribute__((swift_name("productDescription")));
@property (readonly) int64_t productId __attribute__((swift_name("productId")));
@property (readonly) NSString *productName __attribute__((swift_name("productName")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpProductDetail")))
@interface SharedKmpProductDetail : SharedBase
- (instancetype)initWithCategoryId:(int32_t)categoryId discount:(double)discount picture:(NSString *)picture price:(double)price productDescription:(NSString *)productDescription productId:(int32_t)productId productName:(NSString *)productName __attribute__((swift_name("init(categoryId:discount:picture:price:productDescription:productId:productName:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpProductDetail *)doCopyCategoryId:(int32_t)categoryId discount:(double)discount picture:(NSString *)picture price:(double)price productDescription:(NSString *)productDescription productId:(int32_t)productId productName:(NSString *)productName __attribute__((swift_name("doCopy(categoryId:discount:picture:price:productDescription:productId:productName:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t categoryId __attribute__((swift_name("categoryId")));
@property (readonly) double discount __attribute__((swift_name("discount")));
@property (readonly) NSString *picture __attribute__((swift_name("picture")));
@property (readonly) double price __attribute__((swift_name("price")));
@property (readonly) NSString *productDescription __attribute__((swift_name("productDescription")));
@property (readonly) int32_t productId __attribute__((swift_name("productId")));
@property (readonly) NSString *productName __attribute__((swift_name("productName")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpProductDetails")))
@interface SharedKmpProductDetails : SharedBase
- (instancetype)initWithProductId:(NSString *)productId productName:(NSString *)productName description:(NSString *)description sections:(NSArray<SharedKmpProductDetailsSection *> *)sections reviews:(NSArray<SharedKmpProductDetailsReview *> *)reviews __attribute__((swift_name("init(productId:productName:description:sections:reviews:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpProductDetails *)doCopyProductId:(NSString *)productId productName:(NSString *)productName description:(NSString *)description sections:(NSArray<SharedKmpProductDetailsSection *> *)sections reviews:(NSArray<SharedKmpProductDetailsReview *> *)reviews __attribute__((swift_name("doCopy(productId:productName:description:sections:reviews:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *description_ __attribute__((swift_name("description_")));
@property (readonly) NSString *productId __attribute__((swift_name("productId")));
@property (readonly) NSString *productName __attribute__((swift_name("productName")));
@property (readonly) NSArray<SharedKmpProductDetailsReview *> *reviews __attribute__((swift_name("reviews")));
@property (readonly) NSArray<SharedKmpProductDetailsSection *> *sections __attribute__((swift_name("sections")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpProductDetails.Review")))
@interface SharedKmpProductDetailsReview : SharedBase
- (instancetype)initWithUserName:(NSString *)userName review:(NSString *)review rating:(int32_t)rating date:(NSString *)date __attribute__((swift_name("init(userName:review:rating:date:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpProductDetailsReview *)doCopyUserName:(NSString *)userName review:(NSString *)review rating:(int32_t)rating date:(NSString *)date __attribute__((swift_name("doCopy(userName:review:rating:date:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *date __attribute__((swift_name("date")));
@property (readonly) int32_t rating __attribute__((swift_name("rating")));
@property (readonly) NSString *review __attribute__((swift_name("review")));
@property (readonly) NSString *userName __attribute__((swift_name("userName")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpProductDetails.Section")))
@interface SharedKmpProductDetailsSection : SharedBase
- (instancetype)initWithSectionName:(NSString *)sectionName sectionContent:(NSArray<SharedKmpProductDetailsSectionDetail *> *)sectionContent __attribute__((swift_name("init(sectionName:sectionContent:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpProductDetailsSection *)doCopySectionName:(NSString *)sectionName sectionContent:(NSArray<SharedKmpProductDetailsSectionDetail *> *)sectionContent __attribute__((swift_name("doCopy(sectionName:sectionContent:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<SharedKmpProductDetailsSectionDetail *> *sectionContent __attribute__((swift_name("sectionContent")));
@property (readonly) NSString *sectionName __attribute__((swift_name("sectionName")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpProductDetails.SectionDetail")))
@interface SharedKmpProductDetailsSectionDetail : SharedBase
- (instancetype)initWithName:(NSString *)name value:(NSString *)value __attribute__((swift_name("init(name:value:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpProductDetailsSectionDetail *)doCopyName:(NSString *)name value:(NSString *)value __attribute__((swift_name("doCopy(name:value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpRegisterResult")))
@interface SharedKmpRegisterResult : SharedBase
- (instancetype)initWithSuccess:(BOOL)success message:(NSString *)message __attribute__((swift_name("init(success:message:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpRegisterResult *)doCopySuccess:(BOOL)success message:(NSString *)message __attribute__((swift_name("doCopy(success:message:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *message __attribute__((swift_name("message")));
@property (readonly) BOOL success __attribute__((swift_name("success")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KmpUser")))
@interface SharedKmpUser : SharedBase
- (instancetype)initWithUserId:(int64_t)userId username:(NSString *)username email:(NSString *)email token:(NSString *)token __attribute__((swift_name("init(userId:username:email:token:)"))) __attribute__((objc_designated_initializer));
- (SharedKmpUser *)doCopyUserId:(int64_t)userId username:(NSString *)username email:(NSString *)email token:(NSString *)token __attribute__((swift_name("doCopy(userId:username:email:token:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *email __attribute__((swift_name("email")));
@property (readonly) NSString *token __attribute__((swift_name("token")));
@property (readonly) int64_t userId __attribute__((swift_name("userId")));
@property (readonly) NSString *username __attribute__((swift_name("username")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StaticAnnouncementData")))
@interface SharedStaticAnnouncementData : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)staticAnnouncementData __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStaticAnnouncementData *shared __attribute__((swift_name("shared")));
- (SharedKmpAnnouncement * _Nullable)getAnnouncementByIdId:(int64_t)id __attribute__((swift_name("getAnnouncementById(id:)")));
- (NSArray<SharedKmpAnnouncement *> *)getAnnouncements __attribute__((swift_name("getAnnouncements()")));
- (NSArray<SharedKmpAnnouncement *> *)getAnnouncementsByPriorityPriority:(NSString *)priority __attribute__((swift_name("getAnnouncementsByPriority(priority:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StaticCartData")))
@interface SharedStaticCartData : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)staticCartData __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStaticCartData *shared __attribute__((swift_name("shared")));
- (BOOL)addProductToCartUserId:(int64_t)userId productId:(int64_t)productId __attribute__((swift_name("addProductToCart(userId:productId:)")));
- (void)clearCartUserId:(int64_t)userId __attribute__((swift_name("clearCart(userId:)")));
- (NSArray<SharedKmpCart *> * _Nullable)getCartForUserUserId:(int64_t)userId __attribute__((swift_name("getCartForUser(userId:)")));
- (BOOL)removeProductFromCartUserId:(int64_t)userId productId:(int64_t)productId __attribute__((swift_name("removeProductFromCart(userId:productId:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StaticCategoryData")))
@interface SharedStaticCategoryData : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)staticCategoryData __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStaticCategoryData *shared __attribute__((swift_name("shared")));
- (NSArray<SharedKmpCategory *> *)getCategories __attribute__((swift_name("getCategories()")));
- (SharedKmpCategory * _Nullable)getCategoryByIdCategoryId:(int64_t)categoryId __attribute__((swift_name("getCategoryById(categoryId:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StaticPdfData")))
@interface SharedStaticPdfData : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)staticPdfData __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStaticPdfData *shared __attribute__((swift_name("shared")));
- (SharedKmpPdf * _Nullable)getPdfByIdPdfId:(int64_t)pdfId __attribute__((swift_name("getPdfById(pdfId:)")));
- (NSArray<SharedKmpPdf *> *)searchPdfsQuery:(NSString *)query __attribute__((swift_name("searchPdfs(query:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StaticProductData")))
@interface SharedStaticProductData : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)staticProductData __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStaticProductData *shared __attribute__((swift_name("shared")));
- (NSArray<SharedKmpProductDetailsReview *> *)generateFakeReviewList __attribute__((swift_name("generateFakeReviewList()")));
- (id<SharedKotlinx_coroutines_coreFlow>)getKmpProductDetails __attribute__((swift_name("getKmpProductDetails()")));
- (SharedKmpProductDetail * _Nullable)getProductByIdProductId:(int64_t)productId __attribute__((swift_name("getProductById(productId:)")));
- (NSArray<SharedKmpProduct *> *)getProducts __attribute__((swift_name("getProducts()")));
- (NSArray<SharedKmpProduct *> *)getProductsByCategoryIdCategoryId:(int64_t)categoryId __attribute__((swift_name("getProductsByCategoryId(categoryId:)")));
- (NSArray<SharedKmpProduct *> *)getProductsPaginatedCategoryId:(int64_t)categoryId pageIndex:(int32_t)pageIndex pageLength:(int32_t)pageLength __attribute__((swift_name("getProductsPaginated(categoryId:pageIndex:pageLength:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StaticUserData")))
@interface SharedStaticUserData : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)staticUserData __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStaticUserData *shared __attribute__((swift_name("shared")));
- (SharedKmpUser * _Nullable)getUserByIdUserId:(int64_t)userId __attribute__((swift_name("getUserById(userId:)")));
- (SharedKmpUser * _Nullable)getUserByTokenToken:(NSString *)token __attribute__((swift_name("getUserByToken(token:)")));
- (SharedKmpLoginResult *)loginUserUsername:(NSString *)username password:(NSString *)password __attribute__((swift_name("loginUser(username:password:)")));
- (SharedKmpRegisterResult *)registerUserUsername:(NSString *)username password:(NSString *)password __attribute__((swift_name("registerUser(username:password:)")));
- (BOOL)validateTokenToken:(NSString *)token __attribute__((swift_name("validateToken(token:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StaticProductDataKt")))
@interface SharedStaticProductDataKt : SharedBase
+ (float)averageRating:(NSArray<SharedKmpProductDetailsReview *> *)receiver __attribute__((swift_name("averageRating(_:)")));
+ (NSArray<SharedKotlinTriple<SharedInt *, SharedInt *, SharedFloat *> *> *)totalReviewsByRating:(NSArray<SharedKmpProductDetailsReview *> *)receiver __attribute__((swift_name("totalReviewsByRating(_:)")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreFlow")))
@protocol SharedKotlinx_coroutines_coreFlow
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)collectCollector:(id<SharedKotlinx_coroutines_coreFlowCollector>)collector completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("collect(collector:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinTriple")))
@interface SharedKotlinTriple<__covariant A, __covariant B, __covariant C> : SharedBase
- (instancetype)initWithFirst:(A _Nullable)first second:(B _Nullable)second third:(C _Nullable)third __attribute__((swift_name("init(first:second:third:)"))) __attribute__((objc_designated_initializer));
- (SharedKotlinTriple<A, B, C> *)doCopyFirst:(A _Nullable)first second:(B _Nullable)second third:(C _Nullable)third __attribute__((swift_name("doCopy(first:second:third:)")));
- (BOOL)equalsOther:(id _Nullable)other __attribute__((swift_name("equals(other:)")));
- (int32_t)hashCode __attribute__((swift_name("hashCode()")));
- (NSString *)toString __attribute__((swift_name("toString()")));
@property (readonly) A _Nullable first __attribute__((swift_name("first")));
@property (readonly) B _Nullable second __attribute__((swift_name("second")));
@property (readonly) C _Nullable third __attribute__((swift_name("third")));
@end

__attribute__((swift_name("KotlinThrowable")))
@interface SharedKotlinThrowable : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));

/**
 * @note annotations
 *   kotlin.experimental.ExperimentalNativeApi
*/
- (SharedKotlinArray<NSString *> *)getStackTrace __attribute__((swift_name("getStackTrace()")));
- (void)printStackTrace __attribute__((swift_name("printStackTrace()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKotlinThrowable * _Nullable cause __attribute__((swift_name("cause")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
- (NSError *)asError __attribute__((swift_name("asError()")));
@end

__attribute__((swift_name("KotlinException")))
@interface SharedKotlinException : SharedKotlinThrowable
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end

__attribute__((swift_name("KotlinRuntimeException")))
@interface SharedKotlinRuntimeException : SharedKotlinException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end

__attribute__((swift_name("KotlinIllegalStateException")))
@interface SharedKotlinIllegalStateException : SharedKotlinRuntimeException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.4")
*/
__attribute__((swift_name("KotlinCancellationException")))
@interface SharedKotlinCancellationException : SharedKotlinIllegalStateException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreFlowCollector")))
@protocol SharedKotlinx_coroutines_coreFlowCollector
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)emitValue:(id _Nullable)value completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("emit(value:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinArray")))
@interface SharedKotlinArray<T> : SharedBase
+ (instancetype)arrayWithSize:(int32_t)size init:(T _Nullable (^)(SharedInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (T _Nullable)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (id<SharedKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(T _Nullable)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end

__attribute__((swift_name("KotlinIterator")))
@protocol SharedKotlinIterator
@required
- (BOOL)hasNext __attribute__((swift_name("hasNext()")));
- (id _Nullable)next __attribute__((swift_name("next()")));
@end

#pragma pop_macro("_Nullable_result")
#pragma clang diagnostic pop
NS_ASSUME_NONNULL_END
