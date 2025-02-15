package zio.http.model.headers
import zio.stacktracer.TracingImplicits.disableAutoTrace // scalafix:ok;

/**
 * A trait that provides a ton of powerful operators when extended. Any type
 * that extends HeaderExtension needs to implement the two methods viz.
 * `getHeaders` and `updateHeaders`. All other operators are built on top these
 * two methods.
 */
private[zio] trait HeaderExtension[+A] extends HeaderModifier[A] with HeaderGetters[A] with HeaderChecks[A] {
  self: A =>
}
